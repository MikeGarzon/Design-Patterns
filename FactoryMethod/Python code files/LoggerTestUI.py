# "Factory Method" example.
# This example was elaborated from Partha Kuchana's example of his book "Software Architecture Design Patterns in Java" by Alvaro Abril Olis and Henry Alberto Diosa with Maicol Garzon modifiers

from tkinter import *
from LoggerFactory import *

class LoggerTestUI (Toplevel):
    """Class that implements the GUI model."""  
    FILE_LOGGER = "File"
    CONSOLE_LOGGER = "Console"
    DATABASE_LOGGER = "Database"
    EXIT = "Exit"

    def __init__(self,master):
        
        Toplevel.__init__(self,master)
        self.__lblText = Label(self,text="Message")
        self.__lblResult = Label(self,text="Result:")
        self.__lblResultValue = Label(self,text="Please, click to save")
        self.__txtText = Text(self,height=1, width=30)
        self.__fileButton = Button(self,text=LoggerTestUI.FILE_LOGGER)
        self.__consoleButton = Button(self,text=LoggerTestUI.CONSOLE_LOGGER)
        self.__exitButton = Button(self,text=LoggerTestUI.EXIT)   
        self.__lblText.grid(row=1,column=1,padx=10,pady=10)
        self.__txtText.grid(row=1,column=2,padx=10,pady=10)
        self.__lblResult.grid(row=2,column=1,padx=10,pady=10)
        self.__lblResultValue.grid(row=2,column=2,padx=10,pady=10)
        self.__fileButton.grid(row=3,column=1,padx=10,pady=10)
        self.__consoleButton.grid(row=3,column=2,padx=10,pady=10)
        self.__exitButton.grid(row=4,column=2,padx=10,pady=10)

        self.__dbButton = Button(self,text=LoggerTestUI.DATABASE_LOGGER)   
        self.__dbButton.grid(row=3,column=3,padx=10,pady=10)

    def setResultValue(self,searchResult):
        self.__lblResultValue['text']= searchResult

    def getTxtText(self):
        return self.__txtText.get('1.0', END)

    def getFileButton(self):
        return self.__fileButton
    
    def getConsoleButton(self):
        return self.__consoleButton
        
    def getExitButton(self):
        return self.__exitButton

    def getDbButton(self):
        return self.__dbButton
#End of class

class ButtonHandler():
    
    def __init__(self,root):
      self.__root=root
      self.__frame=LoggerTestUI(root)
      self.__frame.getFileButton().configure(command=self.eventFile)
      self.__frame.getConsoleButton().configure(command=self.eventConsole)
      self.__frame.getExitButton().configure(command=self.eventExit)
      
      self.__frame.getDbButton().configure(command=self.eventDB)

      self.__factory = LoggerFactory()
        
    def eventFile(self):
      logger = self.__factory.getLogger(1)
      logger.log(self.__frame.getTxtText())
      self.__frame.setResultValue('The message was written to file')
      
    def eventConsole(self):
      logger = self.__factory.getLogger(2)
      logger.log(self.__frame.getTxtText())
      self.__frame.setResultValue('The message was written to console')

    def eventDB(self):
      logger = self.__factory.getLogger(3)
      logger.log(self.__frame.getTxtText())
      self.__frame.setResultValue('The message was written to DataBase')  
        
    def eventExit(self):
      self.__frame.destroy()
      self.__root.destroy()
#End of class

if __name__=="__main__":
    root = Tk()
    root.withdraw()
    root.title("Factory Method Pattern - Example")
    app = ButtonHandler(root)
    root.mainloop()



      
    
    
   
