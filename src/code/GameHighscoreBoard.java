package code;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GameHighscoreBoard {
    private HashMap<Integer, Integer> scoreMap = new HashMap<>();
    private final String FILE_NAME = "score.txt";

    public GameHighscoreBoard(){
        readFile();
    }

    public void writeScore(){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(FILE_NAME, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Can't create a text file");
        }

        Iterator it = scoreMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            writer.println(pair.getKey() + ":" + pair.getValue());
        }
        writer.close();
    }

    public void readFile() {
        String line;

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if(!line.equals("")) addScore(line);

            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            createFile(FILE_NAME);
        }
        catch(IOException ex) {
            System.out.println("Error reading text file");
        }
    }

    public void createFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        }catch (IOException ex) {
            System.out.println("Error create text file");
        }
    }

    public void addScore(String line){
        String[] temp = line.split(":");
        int mal = Integer.parseInt(temp[0]);
        int score = Integer.parseInt(temp[1]);
        scoreMap.put(mal, score);
    }

    public void addScore(int mal, int score){
        if(scoreMap.containsKey(mal)){
            scoreMap.replace(mal, score);
        }else scoreMap.put(mal, score);

        writeScore();
    }

    public HashMap<Integer, Integer> getScoreMap() {
        return scoreMap;
    }
}
