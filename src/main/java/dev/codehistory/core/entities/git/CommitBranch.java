package dev.codehistory.core.entities.git;

import dev.codehistory.core.entities.IdEntity;

public class CommitBranch extends IdEntity {
    private final Commit commit;
    private final Branch branch;

    public CommitBranch(Commit commit, Branch branch) {
        this.commit = commit;
        this.branch = branch;
    }

    public Commit getCommit() {
        return commit;
    }

    public Branch getBranch() {
        return branch;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 23 * result + commit.hashCode();
        result = 23 * result + branch.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommitBranch)) {
            return false;
        }

        CommitBranch wrapper = (CommitBranch) obj;
        return wrapper.getCommit().equals(getCommit()) &&
                wrapper.getBranch().equals(getBranch());
    }
}
