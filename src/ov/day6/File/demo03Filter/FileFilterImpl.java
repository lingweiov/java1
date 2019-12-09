package ov.day6.File.demo03Filter;/*
@outhor shkstart
@date 2019/12/3-9:28
*/

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().endsWith("Skill.java");
    }
}
