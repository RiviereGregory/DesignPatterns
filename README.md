DesignPatterns
==============
--------------------------------------
**Patterns de construction**

1. **Abstract Factory** :
	* Le but du pattern **Abstract Factory** est la cr�ation d'objets regroup�s en familles 
sans devoir conna�tre les classes concr�tes destin�es � la cr�ation de ces objets.

2. **Builder** : 
	* Le but du pattern **Builder** est d'abstraire la construction d'objets complexes 
	de leur implantation de sorte qu'un client puisse cr�er ces objets complexes 
	sans devoir se pr�occuper des diff�rences d'implantation.

3. **Factory Method** : 
	* Le but du pattern **Factory Method** est d'introduire une methode abstraite de cr�ation 
	d'un objet en reportant aux sous-classes concr�tes la cr�ation effective.
	
4. **Prototype** :
	* Le but du pattern **Prototype** est la cr�ation de nouveaux objets par duplication d'objets
	existants appel�s prototypes qui disposent de la capacit� de clonage.
	
5. **Singleton** :
	* Le pattern **Singleton** a pour but d'assurer qu'une classe ne poss�de qu'une seule instance 
	et de fournir une m�thode de classe unique retournant cette instance.
	
--------------------------------------- 
**Patterns de structuration**

6. **Adapter** :
	* Le but du pattern **Adapter** est de convertir l'interface d'une classe existante en l'interface 
	attendue par les clients �galement existants afin qu'ils puissent travailler ensemble. Il s'agit 
	de conf�rer � une classe existante une nouvelle interface pour r�pondre aux besoins des clients.
	
7. **Bridge** :
	* Le but du pattern **Bridge** est de s�parer l'aspect d'implantation d'un objet de son aspect 
	de repr�sentation et d'interface.
	
8. **Composite** :
	* Le but du pattern **Composite** est d'offrir un cadre de conception d'une composition d'objets 
	dont la profondeur est variable, cette conception �tant bas�e sur un arbre.
	
9. **Decorator** :
	* Le but du pattern **Decorator** est d'ajouter dynamiquement des fonctionnalit�s suppl�mentaires 
	� un objet. Cet ajout de fonctionnalit�s ne modifie pas l'interface de l'objet et reste donc 
	transparent vis-�-vis des clients.

10. **Facade** :
	* L'objectif du pattern **Facade** est de regrouper les interfaces d'un ensemble d'objets en 
	une interface unifi�e rendant cet ensemble plus simple � utiliser pour un client.
	
11. **Flyweight** :
	* Le but du pattern **Flyweight** est de partager de fa�on efficace un ensemble important 
	d'objets de grain fin.
	
12. **Proxy** :
	* Le pattern **Proxy** a pour objectif la conception d'un objet qui se substitue � un autre 
	objet (le sujet) et qui en contr�le l'acc�s.
	
	
--------------------------------------- 
**Patterns de comportement**

13. **Chain of Responsibility** :
	* Le pattern **Chain of Responsibility** construit une chaine d'objets telle que si un objet 
	de la chaine ne peut pas r�pondre � une requ�te, il puisse la transmettre � son successeur 
	et ainsi de suite jusqu'� ce que l'un des objets de la chaine y r�ponde.

14. **Command** :
	* Le pattern **Command** a pour objectif de transformer une requ�te en un objet, facilitant 
	des op�rations comme l'annulation, la mise en file des requ�tes et leur suivi.
	
15. **Interpreter** :
	* Le partern **Interpreter** fournit un cadre pour donner une repr�sentation par objets de la 
	grammaire d'un langage afin d'�valuer, en les interpr�tant, des expressions �crites dans ce langage.
	
16. **Iterator** :
	* Le pattern **Iterator** fournit un acc�s s�quentiel � une collection d'objets � des clients 
	sans que ceux-ci doivent se pr�occuper de l'implantation de cette collection.
	
17. **Mediator** :
	* Le pattern **Mediator** a pur but de construire un objet dont la vocation est la gestion et le 
	contr�le des interactions dans un ensemble d'objets sans que ses �l�ments doivent se conna�tre 
	mutuellement.
	


