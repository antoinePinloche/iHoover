Ihoover
Application développer en Java-SE15, avec Graddle sous l'IDE Eclipse .

l'application est a executer avec 6 arguments pour son bon fonctionnement. 
./APP gridX gridY hooverX hooverY hooverOrientation SequenceOrder
./APP 10 10 5 5 N DAG

hooverOrientation peux avoir possibilité N, E, S, W (north, est, south, west)
SequenceOrder est constitué d'un ensemble de lettre qui ont en possibilité A, G, D (avancer, gauche, droite)

une option unique  : -h est la pour la commande help qui vous donneras des indications sur son fonctionnement

Des testes unitaire sont préssent pour vérifier que tout marche comme attendu.

ParserTest :
les testes du parser sont la pour vérifier que les arguments ont le bon nombres pour le lancements de l'application.

HooverTest :
les testes hoover son la vérifier que la position de l'aspirateur est au bon enplacement final et dans la bonne orientation.