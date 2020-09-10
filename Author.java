package practice2_1;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name=name;
        setEmail(email);
        this.gender=gender;
    };
    public String getName(){ return this.name;};
    public String getEmail(){ return this.email;};
    public char getGender(){ return this.gender;};
    public void setEmail(String email){this.email=email;};
    public String toString(){return ("name: "+this.getName()+"\nemail: "+this.getEmail()+"\ngender: "+ this.getGender());};
}
