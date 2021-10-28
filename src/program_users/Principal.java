package program_users;

import program_users.endities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("entre com o caminho do arquivo");
        String caminho=in.nextLine();
        try(BufferedReader bd = new BufferedReader(new FileReader(caminho))){
            Set<LogEntry> set = new HashSet<>();
            String line=bd.readLine();
            while(line !=null){
                String[] fields =line.split(" ");
                String username=fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(username,moment));
                line=bd.readLine();
            }
        System.out.println("total de usuarios"+set.size());
        }catch (IOException e){
            System.out.println("Erro!"+e.getMessage());
        }

    }
}
