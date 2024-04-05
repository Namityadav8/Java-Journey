
        File f0 = new File("input.txt");
        if(f0.delete()){
            System.out.println(f0.getName()+"file is deleted successfully");
        }else{
            System.out.println("unexpected error found in deletion of the file .");
        }