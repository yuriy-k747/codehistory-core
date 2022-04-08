# codehistory-core
The library for compiling the semantic history of the source code in Git.

## Simple usage scenario

The snippet below uses two sources of content of the class, before and after adding a new method. 

The "old" class definition:

``` java
package dev.codehistory;

class HelloWorld {
}
```

"New" definition:

``` java
package dev.codehistory;

class HelloWorld {
  public void foo() { }
}
```

Find all changes in the HelloWorld class, and then print brief info about parsed class and member:

``` java
public static void main(String[] args) {
  // pack of changed classes to compile
  Pack pack = new Pack();

  // old content: an empty class
  final String classHelloWorldOld =
      "package dev.codehistory;\r\n" +
      "  class HelloWorld {" +
      "  }";

  // new content: class with a new member - foo method
  final String classHelloWorldNew =
      "package dev.codehistory;\r\n" +
      "  class HelloWorld {" +
      "    public void foo() { }" +
      "  }";

  // crate a diff: new and old content of the changed class
  Diff diff = new DiffString(new DiffKey(SourceType.JAVA, "HelloWorld"), classHelloWorldNew, classHelloWorldOld);
  pack.getDiffs().add(diff);

  ChangesCompiler compiler = new ChangesCompiler();
  // compile a pack of changes. Each CompileResult in the list represents an old and new content of pack diffs.
  List<CompileResult> results = compiler.compileDiff(pack);

  CompileResult helloWordClassChange = results.get(0);

  List<ModuleUnitChange> classChanges = helloWordClassChange.findUnitChanges("dev.codehistory", "HelloWorld");
  ModuleUnitChange change = classChanges.get(0); // there's a single class change

  System.out.printf("Class \"%s\" was %s%n", change.getModuleUnit().getIdentifier(), change.getChangeType());
  // > Class "HelloWorld" was CHANGED

  List<ModuleUnitMemberChange> classMembersChanges = helloWordClassChange.findMemberChanges("dev.codehistory", "HelloWorld");
  ModuleUnitMemberChange memberChange = classMembersChanges.get(0); // single change - the method was added

  System.out.printf("The method \"%s\" was %s%n", memberChange.getModuleUnitMember().getIdentifier(), memberChange.getChangeType());
  // > The method "foo" was ADDED

  // involved source code
  ModuleUnit unit = change.getModuleUnit();
  ModuleUnitMember member = memberChange.getModuleUnitMember();

  System.out.printf("Unit: \"%s %s\" from %s package%n", unit.getKeyword(), unit.getIdentifier(), unit.getModule().getName());
  // > Unit definition: "class HelloWorld" from dev.codehistory package

  System.out.printf("Member: \"%s %s\" from \"%s\" %s%n",
      member.getCategory(), member.getIdentifier(), member.getModuleUnit().getIdentifier(), member.getModuleUnit().getKeyword());
  // > Member: "method foo" from "HelloWorld" class
}
```
