package SwingApp;

public class salonesDocentes {

    String s, salon, docente;

    salonesDocentes(String s) {
        switch (s) {
            //semestre 1
            case "MÉTODOS DE ESTUDIO Y NUEVAS TECNOLOGÍAS DE LA COMUNICACIÓN":
                salon = "B-113";
                docente = "DARIO BORRAS";
                break;
            case "CÁTEDRA AGUSTINIANA":
                salon = "B-115";
                docente = "LEONARDO MORAL";
                break;
            case "INTRODUCCIÓN AL DESARROLLO DE SOFTWARE":
                salon = "B-220";
                docente = "TRINIDAD HUERTAS";
                break;
            case "ALGORITMIA Y PROGRAMACIÓN BÁSICA":
                salon = "S-113";
                docente = "AZUCENA AMADO";
                break;
            case "ALGEBRA LINEAL":
                salon = "S-115";
                docente = "GERMAN GARCIA";
                break;
            case "CALCULO DIFERENCIAL":
                salon = "A-310";
                docente = "JULIETA GRACIA";
                break;

            // semestre2
            case "CALCULO INTEGRAL":
                salon = "B-330";
                docente = "MAURICIA M";
                break;
            case "NGLES I":
                salon = "B-125";
                docente = "JHONATHAN PLAZA";
                break;
            case "HUMANIDADES I":
                salon = "B-331";
                docente = "GUSTAVO SERRA";
                break;
            case "ESTRUCTURAS DE DATOS":
                salon = "A-210";
                docente = "AGUSTIN LEAL";
                break;
            case "PROGRAMACIÓN ORIENTADA A OBJETOS":
                salon = "B-115";
                docente = "SIRA LAFUENTE";
                break;
            case "INTRODUCCIÓN AL EMPRENDIMIENTO":
                salon = "S-101";
                docente = "REYES MALDONADO";
                break;

            //semestre 3 
            case "CONTABILIDAD":
                salon = "A-113";
                docente = "MANUELA AGUIRRE";
                break;
            case "ESTADISTICA":
                salon = "S-115";
                docente = "MONSERRAT AGUADO";
                break;
            case "ANÁLISIS Y DISEÑO DE SOFTWARE":
                salon = "B-310";
                docente = "JOSE PABLO PONCE";
                break;
            case "MODELADO DE BASES DE DATOS":
                salon = "A-401";
                docente = "PATRICIO ACUÑA";
                break;
            case "FUNDAMENTOS DE DESARROLLO WEB":
                salon = "B-119";
                docente = "VANESA SANCHO";
                break;
            case "INGLES II":
                salon = "S-211";
                docente = "CARLOS ANTONIO AMOROS";
                break;

            //semestre 4
            case "EMPRENDIMIENTO I":
                salon = "B-200";
                docente = "JUAN MARIA TORREJON";
                break;
            case "ESTRUCTURAS DE DATOS AVANZADA":
                salon = "A-401";
                docente = "JUAN PEDRO AMAT";
                break;
            case "CONSTRUCCIÓN DE APLICACIONES WEB":
                salon = "A-402";
                docente = "MIRIAN LEMA";
                break;
            case "GESTIÓN DE BASES DE DATOS":
                salon = "B-101";
                docente = "GLORIA MARIA SEGUIRA";
                break;
            case "TECNOLOGÍAS PARA APLICACIONES MOVILES":
                salon = "S-101";
                docente = "LUCAS INFANTE";
                break;
            case "INGLES III":
                salon = "B-330";
                docente = "CARLOS JAVIER POZO";
                break;

            // semestre 5
            case "SISTEMAS OPERATIVOS Y ARQUITECTURA DE HARDWARE":
                salon = "B-113";
                docente = "MARI CUESTA";
                break;
            case "TÉCNICAS AVANZADAS DE PROGRAMACIÓN PARA MÓVILES":
                salon = "S-115";
                docente = "GEORGINA MATEO";
                break;
            case "ARQUITECTURA DE SOFTWARE":
                salon = "B-205";
                docente = "ALESSANDRO PRADO";
                break;
            case "INVESTIGACIÓN FORMATIVA":
                salon = "S-103";
                docente = "BRENDA FAJARDO";
                break;
            case "INGLES IV":
                salon = "B-111";
                docente = "JUNE MONTOYA";
                break;
            case "ÉTICA":
                salon = "S-310";
                docente = "JOSUE ARANDA";
                break;

            //semestre 6
            case "DESARROLLO Y REFINAMIENTO DE SOFTWARE":
                salon = "A-110";
                docente = "VEGA CLEMENTE";
                break;
            case "OPCIÓN DE GRADO":
                salon = "A-117";
                docente = "MALONCITO VILLALBA";
                break;
            case "ELECTIVA PROFESIONAL I":
                salon = "B-231";
                docente = "GASPAR CORDERO";
                break;
            case "ELECTIVA PROFESIONAL II":
                salon = "S-118";
                docente = "SALOME RODRIGUEZ";
                break;
            case "ELECTIVA PROFESIONAL III":
                salon = "B-114";
                docente = "YANIRA PORRAS S";
                break;
            case "LEGISLACIÓN TECNOLÓGICA":
                salon = "S-101";
                docente = "ALEJANDRO TENA";
                break;
        }
    }

    public String salon() {
        return salon;
    }

    public String docente() {
        return docente;
    }
}
