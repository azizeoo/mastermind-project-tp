CREATE TEXT TABLE JOUEUR(
ID_JOUEUR INT NOT NULL ,
VICTOIRE INT DEFAULT 0,
DEFAITE INT DEFAULT 0,
SCORE INT DEFAULT 0,
PRIMARY KEY (ID_JOUEUR)
);

SET TABLE JOUEUR SOURCE "joueur;fs=|"