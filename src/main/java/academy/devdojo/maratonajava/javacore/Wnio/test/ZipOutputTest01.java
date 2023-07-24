package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputTest01 {
    public static void main(String[] args) {
        Path zip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(zip, arquivosParaZipar);
    }
    private static void zip(Path zip, Path arquivosParaZipar) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)){
            for(Path file: directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivos criados com sucesso!");
        }catch (Exception e){
         e.printStackTrace();
        }

    }
}