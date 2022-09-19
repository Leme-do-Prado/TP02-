import java.util.*;

public class Aluno {
    private String nome;
    private int idade;
    private String endereco;
    private UUID uuid; 

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public int getIdade(){
        return idade;
    }

    public void setEndereco(String end){
        this.endereco = end;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setUuid(UUID uuuid){
        this.uuid = uuuid;
    }

    public UUID getUuid(){
        return uuid;
    }
}
