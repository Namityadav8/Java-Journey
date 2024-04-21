try{
            File obj=new File("nlp.txt");
            Scanner sc=new Scanner(obj);
            String larger="";
            String current;
            while (sc.hasNext()) {
            current=sc.next();
            if (current.length()>larger.length()){
            larger=current;
            }
            }
            System.out.println(larger);
            
            }
            catch(Exception e){
                System.out.println(e);
            }