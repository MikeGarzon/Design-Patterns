from Logger import *
from FileUtil import *

class FileLogger(Logger):
    
     def log(self,msg):
         futil = FileUtil()
         futil.writeToFile("log.txt",msg, True, True);
         
         
         
        
    

    
