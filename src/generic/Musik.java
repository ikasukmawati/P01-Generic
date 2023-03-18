/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author LENOVO
 */
public class Musik {
    String path, fileName, fileSize, extention;

    public Musik(String path, String fileName, String fileSize, String extention) {
        this.path = path;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.extention = extention;
    }
    
    

    public String getPath() {
        return path;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getExtention() {
        return extention;
    }
    
    
}
