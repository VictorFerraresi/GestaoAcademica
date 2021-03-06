package gestao;

public class PostGraduateStudent extends Student {
    private String thesisTitle;
    private String supervisor;
    
    public PostGraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle,
            String supervisor){
        super(ID, name, address, phone, email);       
        this.thesisTitle = thesisTitle;
        this.supervisor = supervisor;
    }
    
    public void setThesisTitle(String thesisTitle){
        this.thesisTitle = thesisTitle;
    }
    
    public void setSupervisor(String supervisor){
        this.supervisor = supervisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public String toString(){
       return "\n ID: "+super.ID+"\n Nome: "+super.name+"\n Address: "+super.address+"\n Phone: "+super.phone+"\n Email: "+super.email+"\n thesisTitle: "+this.getThesisTitle()+"\n Supervisor: "+this.getSupervisor();
    }

}
