package com.wa.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;

/**
 * Created by zgeorg03 on 11/10/16.
 */
public class CaseHandler {


    /**
     * Directory for the cases
     */
    private final File directory;

    public CaseHandler(File directory) {
        this.directory = directory;
    }

    public File getDirectory() {
        return directory;
    }

    public boolean newCase(String caseId, byte stream[], InputStream fileStream,boolean fileExists) throws IOException {
        File caseDir = new File(getDirectory().getAbsolutePath()+ "/new_" + caseId);
        if(caseDir.exists())
            return false;
        caseDir.mkdir();
        caseDir.setWritable(true,false);
        caseDir.setReadable(true,false);
        caseDir.setExecutable(true,false);
        Runtime.getRuntime().exec("chmod 777 "+ caseDir.getAbsolutePath());
        FileOutputStream fout = new FileOutputStream(caseDir.getAbsolutePath()+"/base64-encrypted.data");
        fout.write(stream);
        fout.close();
        if(fileExists) {
            java.nio.file.Path foutFile = Paths.get(caseDir.getAbsolutePath(), "encrypted.file");
            Files.copy(fileStream, foutFile);
            fileStream.close();
        }
        File file = new File(caseDir.getAbsolutePath()+"/base64-encrypted.data");
        file.setWritable(true,false);
        file.setReadable(true,false);
        file.setExecutable(true,false);
        return true;
    }
}
