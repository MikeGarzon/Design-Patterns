#Python interface

class Logger(object):
    
    """Python Interface for logger hierarchy
    Methods:
    _init_ --
    log -- Abstract method; it will be implemented by other classes
    """
    def __init__(self):
        pass
   
    def log(self,msg):
        raise Exception("NotImplementedException")