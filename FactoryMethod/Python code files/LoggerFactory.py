from FileLogger import *
from ConsoleLogger import *
from DBLogger import *

class LoggerFactory():
    """Class that contains factory method."""
    def getLogger(self,x):
        if x==1:
            return FileLogger()
        elif x==2:
            return ConsoleLogger()
        elif x==3:
            return DBLogger()

    
