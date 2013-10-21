DesignPatterns
==============
--------------------------------------
**Patterns de construction**

1. **Abstract Factory** :
	* Le but du pattern **Abstract Factory** est la création d'objets regroupés en familles 
sans devoir connaître les classes concrètes destinées à la création de ces objets.

2. **Builder** : 
	* Le but du pattern **Builder** est d'abstraire la construction d'objets complexes 
	de leur implantation de sorte qu'un client puisse créer ces objets complexes 
	sans devoir se préoccuper des différences d'implantation.

3. **Factory Method** : 
	* Le but du pattern **Factory Method** est d'introduire une methode abstraite de création 
	d'un objet en reportant aux sous-classes concrètes la création effective.
	
4. **Prototype** :
	* Le but du pattern **Prototype** est la création de nouveaux objets par duplication d'objets
	existants appelés prototypes qui disposent de la capacité de clonage.
	
5. **Singleton** :
	* Le pattern **Singleton** a pour but d'assurer qu'une classe ne possède qu'une seule instance 
	et de fournir une méthode de classe unique retournant cette instance.
	
--------------------------------------- 
**Patterns de structuration**

6. **Adapter** :
	* Le but du pattern **Adapter** est de convertir l'interface d'une classe existante en l'interface 
	attendue par les clients également existants afin qu'ils puissent travailler ensemble. Il s'agit 
	de conférer à une classe existante une nouvelle interface pour répondre aux besoins des clients.
	
7. **Bridge** :
	* Le but du pattern **Bridge** est de séparer l'aspect d'implantation d'un objet de son aspect 
	de représentation et d'interface.
	
8. **Composite** :
	* Le but du pattern **Composite** est d'offrir un cadre de conception d'une composition d'objets 
	dont la profondeur est variable, cette conception étant basée sur un arbre.
	
9. **Decorator** :
	* Le but du pattern **Decorator** est d'ajouter dynamiquement des fonctionnalités supplémentaires 
	à un objet. Cet ajout de fonctionnalités ne modifie pas l'interface de l'objet et reste donc 
	transparent vis-à-vis des clients.

10. **Facade** :
	* L'objectif du pattern **Facade** est de regrouper les interfaces d'un ensemble d'objets en 
	une interface unifiée rendant cet ensemble plus simple à utiliser pour un client.
	
11. **Flyweight** :
	* Le but du pattern **Flyweight** est de partager de façon efficace un ensemble important 
	d'objets de grain fin.
	
12. **Proxy** :
	* Le pattern **Proxy** a pour objectif la conception d'un objet qui se substitue à un autre 
	objet (le sujet) et qui en contrôle l'accès.
	
	
--------------------------------------- 
**Patterns de comportement**

13. **Chain of Responsibility** :
	* Le pattern **Chain of Responsibility** construit une chaine d'objets telle que si un objet 
	de la chaine ne peut pas répondre à une requête, il puisse la transmettre à son successeur 
	et ainsi de suite jusqu'à ce que l'un des objets de la chaine y réponde.

14. **Command** :
	* Le pattern **Command** a pour objectif de transformer une requête en un objet, facilitant 
	des opérations comme l'annulation, la mise en file des requêtes et leur suivi.
	
15. **Interpreter** :
	* Le partern **Interpreter** fournit un cadre pour donner une représentation par objets de la 
	grammaire d'un langage afin d'évaluer, en les interprétant, des expressions écrites dans ce langage.
	
16. **Iterator** :
	* Le pattern **Iterator** fournit un accès séquentiel à une collection d'objets à des clients 
	sans que ceux-ci doivent se préoccuper de l'implantation de cette collection.
	
17. **Mediator** :
	* Le pattern **Mediator** a pur but de construire un objet dont la vocation est la gestion et le 
	contrôle des interactions dans un ensemble d'objets sans que ses éléments doivent se connaître 
	mutuellement.
	


