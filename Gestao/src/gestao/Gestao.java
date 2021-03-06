package gestao;

import java.util.*;

public class Gestao {
    
    public static void main(String[] args) {   
        University u = new University("Mackenzie");
        showMenu(u);
    }
    
    public static void showCourseMenu(University u){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Visualizar Curso");
        System.out.println("2 - Criar Curso");
        System.out.println("3 - Atualizar Curso");
        System.out.println("0 - Voltar");
        int opt = input.nextInt();
        
        switch(opt){
            case 0:{
                showMenu(u);
                break;
            }
            case 1:{
                input.nextLine();
                System.out.println("Digite o código do curso:");
                String course = input.nextLine();
                if(u.getCourse(course) == null){
                    System.out.println("<!> Este curso não existe!");
                    showCourseMenu(u);
                }
                System.out.println(u.getCourse(course).toString());
                showCourseMenu(u);
                break;
            }
            case 2:{
                System.out.println("Digite o código do curso que deseja criar:");                
                String course = input.next();
                input.nextLine();
                if(u.getCourse(course) != null){
                    System.out.println("<!> Este código de curso já existe!");
                    showCourseMenu(u);
                }
                System.out.println("Digite o nome do curso que deseja criar:");
                String name = input.nextLine();
                System.out.println("Digite o número de créditos do curso que deseja criar:");
                int numcr = input.nextInt();
                System.out.println("Digite o número de vagas do curso que deseja criar:");
                int maxstu = input.nextInt();
                
                u.addCourse(course, name, numcr, maxstu);
                showCourseMenu(u);
                break;
            }
            case 3:{
                input.nextLine();
                System.out.println("Digite o código do curso que deseja atualizar:");
                String course = input.nextLine();
                if(u.getCourse(course) == null){
                    System.out.println("<!> Este curso não existe!");
                    showCourseMenu(u);
                }
                System.out.println("Digite o novo nome do curso:");
                String name = input.nextLine();
                System.out.println("Digite o novo número de créditos do curso:");
                int numcr = input.nextInt();
                System.out.println("Digite o novo número de vagas do curso:");
                int maxstu = input.nextInt();
                
                u.updateCourse(course, name, numcr, maxstu);
                showCourseMenu(u);
                break;
            }
            default:{
                showCourseMenu(u);
                break;
            }
        }
    }
    
    public static void showStudentMenu(University u){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Visualizar Estudante");
        System.out.println("2 - Criar Estudante");
        System.out.println("3 - Atualizar Estudante");
        System.out.println("0 - Voltar");
        int opt = input.nextInt();
        
        switch(opt){
            case 0:{
                showMenu(u);
                break;
            }
            case 1:{
                System.out.println("Digite o ID do Estudante:");
                long student = input.nextLong();
                if(u.getStudent(student) == null){
                    System.out.println("<!> Este estudante não existe!");
                    showStudentMenu(u);
                }
                System.out.println(u.getStudent(student).toString());
                showStudentMenu(u);
                break;
            }
            case 2:{
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Undergraduate Student");
                System.out.println("2 - Postgraduate Student");  
                int opt2 = input.nextInt();
                switch(opt2){
                    case 1:{
                        System.out.println("Digite o ID do estudante que deseja criar:");
                        long student = input.nextLong();
                        input.nextLine();
                        if(u.getStudent(student) != null){
                            System.out.println("<!> Este código de estudante já existe!");
                            showStudentMenu(u);
                        }
                        System.out.println("Digite o nome do estudante que deseja criar:");
                        String name = input.nextLine();
                        System.out.println("Digite o endereço do estudante que deseja criar:");
                        String address = input.nextLine();
                        System.out.println("Digite o telefone do estudante que deseja criar:");
                        String phone = input.nextLine();
                        System.out.println("Digite o email do estudante que deseja criar:");
                        String email = input.nextLine();
                        System.out.println("Digite o minor do estudante que deseja criar:");
                        String minor = input.nextLine();
                        System.out.println("Digite o major do estudante que deseja criar:");
                        String major = input.nextLine();

                        u.addUnderGraduateStudent(student, name, address, phone, email, minor, major);
                        showStudentMenu(u);
                        break;
                    }
                    case 2:{
                        System.out.println("Digite o ID do estudante que deseja criar:");
                        long student = input.nextLong();
                        input.nextLine();
                        if(u.getStudent(student) != null){
                            System.out.println("<!> Este código de estudante já existe!");
                            showStudentMenu(u);
                        }
                        System.out.println("Digite o nome do estudante que deseja criar:");
                        String name = input.nextLine();
                        System.out.println("Digite o endereço do estudante que deseja criar:");
                        String address = input.nextLine();
                        System.out.println("Digite o telefone do estudante que deseja criar:");
                        String phone = input.nextLine();
                        System.out.println("Digite o email do estudante que deseja criar:");
                        String email = input.nextLine();
                        System.out.println("Digite o título da tese do estudante que deseja criar:");
                        String thesis = input.nextLine();
                        System.out.println("Digite o supervisor do estudante que deseja criar:");
                        String supervisor = input.nextLine();

                        u.addPostGraduateStudent(student, name, address, phone, email, thesis, supervisor);
                        showStudentMenu(u);
                        break;
                    }
                    default:{
                        System.out.println("<!> Opção Inválida.");
                        showStudentMenu(u);
                        break;
                    }
                }
                break;
            }
            case 3:{
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Undergraduate Student");
                System.out.println("2 - Postgraduate Student");  
                int opt2 = input.nextInt();
                switch(opt2){
                    case 1:{
                        System.out.println("Digite o ID do estudante que deseja atualizar:");
                        long student = input.nextLong();
                        input.nextLine();
                        if(u.getStudent(student) == null){
                            System.out.println("<!> Este estudante não existe!");
                            showStudentMenu(u);
                        }
                        System.out.println("Digite o novo nome do estudante:");
                        String name = input.nextLine();
                        System.out.println("Digite o novo endereço do estudante:");
                        String address = input.nextLine();
                        System.out.println("Digite o novo telefone do estudante:");
                        String phone = input.nextLine();
                        System.out.println("Digite o novo email do estudante:");
                        String email = input.nextLine();
                        System.out.println("Digite o novo minor do estudante:");
                        String minor = input.nextLine();
                        System.out.println("Digite o novo major do estudante:");
                        String major = input.nextLine();

                        u.updateUnderGraduateStudent(student, name, address, phone, email, minor, major);
                        showStudentMenu(u);
                        break;
                    }
                    case 2:{
                        System.out.println("Digite o ID do estudante que deseja atualizar:");
                        long student = input.nextLong();
                        input.nextLine();
                        if(u.getStudent(student) == null){
                            System.out.println("<!> Este estudante não existe!");
                            showStudentMenu(u);
                        }
                        System.out.println("Digite o nome do estudante:");
                        String name = input.nextLine();
                        System.out.println("Digite o endereço do estudante:");
                        String address = input.nextLine();
                        System.out.println("Digite o telefone do estudante:");
                        String phone = input.nextLine();
                        System.out.println("Digite o email do estudante:");
                        String email = input.nextLine();
                        System.out.println("Digite o título da tese do estudante:");
                        String thesis = input.nextLine();
                        System.out.println("Digite o supervisor do estudante:");
                        String supervisor = input.nextLine();

                        u.updatePostGraduateStudent(student, name, address, phone, email, thesis, supervisor);                        
                        showStudentMenu(u);
                        break;
                    }
                    default:{
                        System.out.println("<!> Opção Inválida.");
                        showStudentMenu(u);
                        break;
                    }
                }
                break;
            }
            default:{
                showStudentMenu(u);
                break;
            }
        }
    }
    
    public static void showStudentCourses(University u){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID do estudante:");
        long student = input.nextLong();
        if(u.getStudent(student) == null){
            System.out.println("<!> Este estudante não existe!");
            showMenu(u);
        }
        System.out.println(u.getCourses(student).toString());
        u.getCourses(student);
        showMenu(u);
    }
    
    public static void showCourseStudents(University u){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código do curso:");
        String course = input.nextLine();
        if(u.getCourse(course) == null){
            System.out.println("<!> Este curso não existe!");
            showMenu(u);
        }
        System.out.println(u.getStudents(course).toString());
        showMenu(u);
    }
    
    public static void showRegisterMenu(University u){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID do estudante:");
        long student = input.nextLong();
        if(u.getStudent(student) == null){
            System.out.println("<!> Este estudante não existe!");
            showRegisterMenu(u);
        }
        System.out.println("Digite o código do curso:");        
        String course = input.next();
        if(u.getCourse(course) == null){
            System.out.println("<!> Este curso não existe!");
            showRegisterMenu(u);
        }
        
        u.registerStudent(student, course);
        showMenu(u);
    }
    
    public static void showDeRegisterMenu(University u){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID do estudante:");
        long student = input.nextLong();
        if(u.getStudent(student) == null){
            System.out.println("<!> Este estudante não existe!");
            showRegisterMenu(u);
        }
        System.out.println("Digite o código do curso:");
        String course = input.next();
        if(u.getCourse(course) == null){
            System.out.println("<!> Este curso não existe!");
            showRegisterMenu(u);
        }
        
        u.deRegisterStudent(student, course);
        showMenu(u);
    }
    
    public static void showAllCourses(University u){
        System.out.println(u.getCourses());  
        showMenu(u);
    }
    
    public static void showAllStudents(University u){
        System.out.println(u.getStudents());   
        showMenu(u);
    }
    
    public static void showMenu(University u){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Manter Curso");
        System.out.println("2 - Manter Estudante");
        System.out.println("3 - Visualizar Cursos Estudante");
        System.out.println("4 - Visualizar Estudantes Curso");
        System.out.println("5 - Matricular Estudante em Curso");
        System.out.println("6 - Cancelar Matrícula");
        System.out.println("7 - Visualizar Todos Os Cursos");
        System.out.println("8 - Visualizar Todos Os Estudantes");
        System.out.println("0 - Sair do Programa");
        int opt = input.nextInt();
        
        switch(opt){
            case 0:{
                System.exit(0);
            }
            case 1:{
                showCourseMenu(u);
                break;
            }
            case 2:{
                showStudentMenu(u);
                break;
            }
            case 3:{
                showStudentCourses(u);
                break;
            }
            case 4:{
                showCourseStudents(u);
                break;
            }
            case 5:{
                showRegisterMenu(u);
                break;
            }
            case 6:{
                showDeRegisterMenu(u);
                break;
            }
            case 7:{
                showAllCourses(u);
                break;
            }
            case 8:{
                showAllStudents(u);
                break;
            }
            default:{
                showMenu(u);
                break;
            }
        }
    }  
}
