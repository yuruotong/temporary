package text1_java;
import java.io.*;  
public class lianbian {
         public static void main(String[] args){
          Remove a=new Remove("C:\\Users\\MyPC\\Desktop\\","C:\\Users\\MyPC\\Desktop\\临时文件\\","docx");
          
         
         
         }
}
class Remove{
	Remove(String oldPath,String newPath,String fileType){
		 File oldFile = new File(oldPath);
    	 if(!oldFile.exists())System.out.println("没有找到原移动的文件");
    	 File[]  fList=oldFile.listFiles();  
        
         /*遍历*/  
         for(int i=0;i<fList.length;i++)  
          {  
             /*满足文件和指定的后缀时输出*/  
           //  if(fList[i].isFile()&&fList[i].getName().endsWith(fileType)) 
        	 if(!fList[i].getName().equals("一键整理.jar")&&!fList[i].getName().equals("回收站")&&!fList[i].getName().equals("临时文件")) 
        	 
              {  
            	 	//new一个新文件夹
             	File fnewpath = new File(newPath);
             	//判断文件夹是否存在
             	if(!fnewpath.exists())	fnewpath.mkdirs();
             	//将文件移到新文件里
             	File fnew = new File(newPath +fList[i].getName());
             	fList[i].renameTo(fnew);
             	System.out.println(fList[i].getName());

              }  
          }  
        }
   
	

}