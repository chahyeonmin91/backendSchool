package study.day06;


import org.w3c.dom.ls.LSOutput;

//아무것도 상속받지 않은 Object를 상속받는다
        //필드는 타입을 따른다
        //메소드는 오버라이딩되면 무조건 자식을 따른다
        class Bird{
            public void say(){
                System.out.println("??");
            }
        }
        class Parrot extends Bird{
            public void say(){
                System.out.println("안녕");
            }
        }
        class Sparrow extends Bird{
            public void say(){
                System.out.println("짹짹");
            }
        }
        class Dove extends Bird{
            public void say(){
                System.out.println("gg");
            }
        }
        public class Test2 {
            public static void main(String[] args) {
                Bird bird=null;
                if(args[0].equals("parrot")){
                    bird=new Parrot();
                } else if (args[0].equals("sparrow")) {
                    bird=new Sparrow();
                }else{
                    bird = new Dove();
                }
                bird.say();
            }


        }