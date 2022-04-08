using System;

namespace App.TestModule
{
    public class TestClass
    {
        public const string STRING_CONSTANT = "STRING_CONSTANT " +
                                              "multiline " +
                                              "value",
            STRING_CONSTANT_2 = "STRING_CONSTANT_2 single line constant",
            STRING_CONSTANT_3 = "";
        private const int INT_CONSTANT = 100, INT_CONSTANT2 = 200;
        private const int? INT_NULLABLE_CONSTANT = 300, 
            INT_NULLABLE_CONSTANT2 = null;

        public const string STRING_SINGLELINE_CONSTANT = "SINGLE LINE";

        private string _stringField;
        private double _doubleField;

        private readonly float _readonlyFloatField;

        public TestClass(float readonlyFloatField)
        {
            _readonlyFloatField = readonlyFloatField;
        }

        public string StringField
        {
            get { return _stringField; }
        }

        public double DoubleField
        {
            get
            {
                return _doubleField;
            }
            set
            {
                _doubleField = value;
            }
        }

        public void MethodReturnsVoid(string val)
        {
            Console.WriteLine(val);
        }
    }
}