package com.github.zxh.classpy.classfile.attr;

import com.github.zxh.classpy.classfile.ClassReader;
import com.github.zxh.classpy.classfile.U2;

/*
SourceFile_attribute {
    u2 attribute_name_index;
    u4 attribute_length;
    u2 sourcefile_index;
}
 */
public class SourceFileAttribute extends AttributeInfo {

    private U2 sourceFileIndex;
    
    @Override
    protected void readInfo(ClassReader reader) {
        sourceFileIndex = reader.readU2();
    }
    
}