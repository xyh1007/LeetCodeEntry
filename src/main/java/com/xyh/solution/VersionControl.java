package com.xyh.solution;

public class VersionControl {
    public boolean isBadVersion(int version) {
        if (version >= 4) {
            return true;
        }
        return false;
    }
}
