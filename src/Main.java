import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File gamesDir = new File("C:/Games"); // создал объект класса File для папки Games

        // cоздал директории внутри папки Games
        File srcDirCreated = new File(gamesDir, "src");
            srcDirCreated.mkdir();
        File resDirCreated = new File(gamesDir, "res");
            resDirCreated.mkdir();
        File savegamesDirCreated = new File(gamesDir, "savegames");
            savegamesDirCreated.mkdir();
        File tempDirCreated = new File(gamesDir, "temp");
            tempDirCreated.mkdir();

        //  создал директории main и test внутри src
       File mainDirCreated = new File(gamesDir + "/src", "main");
            mainDirCreated.mkdir();
        File testDirCreated = new File(gamesDir + "/src", "test");
            testDirCreated.mkdir();


        // В подкаталоге main создал два файла: Main.java, Utils.java.
        File mainJavaFile = new File(gamesDir + "/src/main", "Main.java");
        File utilsJavaFile = new File(gamesDir + "/src/main", "Utils.java");

        try {
            boolean mainJavaFileCreated = mainJavaFile.createNewFile();
            boolean utilsJavaFileCreated = utilsJavaFile.createNewFile();

            // Сохраняю информацию о создании файлов в StringBuilder
            StringBuilder log = new StringBuilder();
            log.append("src directory created: ").append(srcDirCreated).append("\n")
                    .append("res directory created: ").append(resDirCreated).append("\n")
                    .append("savegames directory created: ").append(savegamesDirCreated).append("\n")
                    .append("temp directory created: ").append(tempDirCreated).append("\n")
                    .append("main directory created: ").append(mainDirCreated).append("\n")
                    .append("test directory created: ").append(testDirCreated).append("\n")
                    .append("Main.java file created: ").append(mainJavaFileCreated).append("\n")
                    .append("Utils.java file created: ").append(utilsJavaFileCreated).append("\n");

            // Создал файл temp.txt и записал в него лог
            File tempTxtFile = new File(gamesDir + "/temp", "temp.txt");
            FileWriter writer = new FileWriter(tempTxtFile);
            writer.write(log.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Error while creating files: " + e.getMessage());
        }
    }
    }
