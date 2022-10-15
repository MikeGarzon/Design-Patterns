import os.path
class FileUtil:
    def writeToFile(self, fileName, dataLine, isAppendMode, isNewLine):
        if(isNewLine):
            dataLine="\n"+dataLine
        try:
            if(isAppendMode):
                f=open(fileName,"a")
            else:
                f=open(fileName,"w")
            f.write(dataLine)
            f.close()
        except IOError:
            print("Error to read the file")
    def readFromFile(self, fileName):
        dataLine=""
        try:
            f=open(fileName,"r")
            dataLine=f.read()
        except IOError:
            print("Error to read the file")
            return None
        return dataLine
    def isFileExists(self, fileName):
        return os.path.isfile(fileName)
    def fileToVector(self, fileName):
        v=[]
        inputLine=""
        try:
            f=open(fileName,"r")
            for line in f:
                v.append(line.rstrip('\n'))
        except IOError:
            print("Error to read the file")
            return None
        return v
    def vectorToFile(self,v,fileName):
        for line in v:
            self.writeToFile(fileName,line,True,True)
#End of class
