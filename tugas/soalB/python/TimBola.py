class TimBola():
    # atribut
    __nama = "blank"
    __asalNegara = "blank"
    __sejak = 0
    __pemain = "blank"

    # constructor
    def __init__(self, name = "blank", country = "blank", since = 0, player = "blank"):
        self.__nama = name
        self.__asalNegara = country
        self.__sejak = since
        self.__pemain = player

    # setter
    def setNama(self, name):
        self.__nama = name
    def setAsalNegara(self, country):
        self.__asalNegara = country
    def setSejak(self, since):
        self.__sejak = since
    def setPemain(self, player):
        self.__pemain = player
        
    # getter
    def getNama(self):
        return self.__nama
    def getAsalNegara(self):
        return self.__asalNegara
    def getSejak(self):
        return self.__sejak
    def getPemain(self):
        return self.__pemain