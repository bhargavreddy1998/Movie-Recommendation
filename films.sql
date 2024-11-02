
---films
create table director(
	dir_id varchar2(3) primary key,
	name varchar2(30) not null,
	avg_box float(8) not null,
	avg_imdb float(8) not null
	);
create table screenwriter(
	sc_id varchar2(3) primary key,
	name varchar2(30)not null,
	avg_box float(8)not null,
	avg_imdb float(8) not null
	);
create table composer(
	comp_id varchar2(3) primary key,
	name varchar2(30) not null
);
create table film_cast(
	cas_id varchar2(3) primary key,
	lead_actor varchar2(30),
	lead_actress varchar2(30),
	supp_actor varchar2(30),
	supp_actress varchar2(30)
);
create table film_awards(
	id varchar2(3) primary key,
	oscars number(2) not null,
	golden_globes number(2) not null
);
create table film(
	id varchar2(3) primary key,
	title varchar2(40) not null,
	year number(4) not null,
	genre varchar2(20) not null,
	dir_id varchar2(3) not null,
	sc_id varchar2(3) not null,
	cas_id varchar2(3) not null,
	comp_id varchar2(3),
	imdb float(8),
	rot_tom float(8),
	budget number(10) not null,
	box_office number(15) not null,
	check (budget>0 and box_office>0),
	foreign key(dir_id) references director(dir_id) on delete cascade,
	foreign key(sc_id) references screenwriter(sc_id) on delete cascade,
	foreign key(cas_id) references film_cast(cas_id) on delete cascade,
	foreign key(comp_id) references composer(comp_id) on delete cascade
);

                            --- film entries
--- director

insert into director values
	('D01','Irvin Kershner',45,6.57);
insert into director values
	('D02','Tom Hooper',23,5.41);
insert into director values
	('D03','Chris Morris',69,6.12);
insert into director values
	('D04','Joe Wright',96,8.48);
insert into director values
	('D05','Jonathan Demme',23,4.24);
insert into director values
	('D06','Francis Ford Coppola',50,6.21);
insert into director values
	('D07','Lana Wachowski',83,4.27);
insert into director values
	('D08','Jon M Chu',74,6.35);
insert into director values
	('D09','Dean DeBlois',45,7.35);
insert into director values
	('D10','Ron Howard',43,9.53);
insert into director values
	('D11','Manoj N Shyamalan',35,8.34);
insert into director values
	('D12','Morten Tyldum',48,6.52);
insert into director values
	('D13','Bryan Singer',98,4.13);
insert into director values
	('D14','Steven Spielberg',67,7.30);
insert into director values
	('D15','Brad Bird',108,8.74);
insert into director values
	('D16','James Mangold',116,6.24);
insert into director values
	('D17','John Lee Hancock',77,6.09);
insert into director values
	('D18','Christopher Nolan',54,5.65);
insert into director values
	('D19','Wes Anderson',30,7.90);
insert into director values
	('D20','Sriram Raghavan',59,9.35);
insert into director values
	('D21','Ben Stiller',45,6.11);
insert into director values
	('D22','Nora Ephron',33,8.40);
insert into director values
	('D23','Scott Derrickson',129,8.93);
insert into director values
	('D24','Ashwiny Tiwari',91,9.32);
insert into director values
	('D25','Todd Philips',55,9.62);
insert into director values
	('D26','Armando Iannucci',63,8.76);
insert into director values
	('D27','Susanne Bier',118,9.86);
insert into director values
	('D28','Alex Garland',29,9.65);
insert into director values
	('D29','David Lynch',36,5.66);
insert into director values
	('D30','Ridley Scott',103,9.20);
insert into director values
	('D31','Damien Chazelle',10,5.98);
insert into director values
	('D32','John Krasinski',113,9.55);
insert into director values
	('D33','Spike Lee',22,9.65);
insert into director values
	('D34','Guillermo del Toro',35,8.49);
insert into director values
	('D35','Hayao Miyazaki',102,9.80);
insert into director values
	('D36','Isao Takahata',30,9.84);
insert into director values
	('D37','Stephen Daldry',59,7.36);
insert into director values
	('D38','Andrew Stanton',85,6.08);
insert into director values
	('D39','Bill Paxton',88,5.10);
insert into director values
	('D40','Peter Ramsey',87,9.82);
insert into director values
	('D41','David O. Russell',117,7.47);

--- screenwriter

insert into screenwriter values
	('S01','Lawrence Kasdan',82,9.37);
insert into screenwriter values
	('S02','David Seidler',83,4.82);
insert into screenwriter values
	('S03','Simon Blackwell',33,6.43);
insert into screenwriter values
	('S04','Jane Austen',63,6.30);
insert into screenwriter values
	('S05','Ted Tally',30,8.29);
insert into screenwriter values
	('S06','Mario Puzo',21,5.05);
insert into screenwriter values
	('S07','Lily Wachowski',32,7.04);
insert into screenwriter values
	('S08','Kevin Kwan',96,8.38);
insert into screenwriter values
	('S09','Cressida Cowell',86,4.67);
insert into screenwriter values
	('S10','Sylvia Nasar',79,7.77);
insert into screenwriter values
	('S11','Manoj N Shyamalan',39,6.44);
insert into screenwriter values
	('S12','Graham Moore',70,4.33);
insert into screenwriter values
	('S13','Christopher McQuarrie',63,9.56);
insert into screenwriter values
	('S14','Thomas Keneally',42,6.51);
insert into screenwriter values
	('S15','Brad Bird',32,8.87);
insert into screenwriter values
	('S16','James Mangold',96,9.81);
insert into screenwriter values
	('S17','Kelly Marcel',10,8.84);
insert into screenwriter values
	('S18','Jonathan Nolan',41,6.95);
insert into screenwriter values
	('S19','Wes Anderson',114,6.30);
insert into screenwriter values
	('S20','Sriram Raghavan',70,7.21);
insert into screenwriter values
	('S21','Steven Conrad',45,8.19);
insert into screenwriter values
	('S22','Nora Ephron',35,6.40);
insert into screenwriter values
	('S23','Stan Lee',39,7.38);
insert into screenwriter values
	('S24','Nitesh Tiwari',61,6.98);
insert into screenwriter values
	('S25','Jon Lucas',115,6.29);
insert into screenwriter values
	('S26','Armando Iannucci',67,9.94);
insert into screenwriter values
	('S27','Eric Heisserer',40,9.15);
insert into screenwriter values
	('S28','Doris Kearns Goodwin',63,5.23);
insert into screenwriter values
	('S29','Alex Garland',85,5.22);
insert into screenwriter values
	('S30','David Lynch',96,5.51);
insert into screenwriter values
	('S31','Drew Goddard',58,7.76);
insert into screenwriter values
	('S32','Damien Chazelle',57,6.02);
insert into screenwriter values
	('S33','John Krasinski',68,8.25);
insert into screenwriter values
	('S34','Ron Stallworth',118,6.37);
insert into screenwriter values
	('S35','Guillermo del Toro',125,8.15);
insert into screenwriter values
	('S36','Hayao Miyazaki',22,8.47);
insert into screenwriter values
	('S37','Riko Sakaguchi',33,5.63);
insert into screenwriter values
	('S38','Jonathan Safran Foer',122,8.49);
insert into screenwriter values
	('S39','Andrew Stanton',33,7.86);
insert into screenwriter values
	('S40','Mark Frost',70,8.95);
insert into screenwriter values
	('S41','David O, Russell',128,9.82);


--- composer
insert into composer values
	('M01','John Williams');
insert into composer values
	('M02','Alexandre Desplat');
insert into composer values
	('M03','Dario Marianelli');
insert into composer values
	('M04','Howard Shore');
insert into composer values
	('M05','Nino Rota');
insert into composer values
	('M06','Don Davis');
insert into composer values
	('M07','Brian Tyler');
insert into composer values
	('M08','John Powell');
insert into composer values
	('M09','James Horner');
insert into composer values
	('M10','James Newton Howard');
insert into composer values
	('M11','John Ottman');
insert into composer values
	('M12','West Dylan Thordson');
insert into composer values
	('M13','Michael Giacchino');
insert into composer values
	('M14','Marco Beltrami');
insert into composer values
	('M15','Thomas Newman');
insert into composer values
	('M16','Hans Zimmer');
insert into composer values
	('M17','David Julyan');
insert into composer values
	('M18','Amit Trivedi');
insert into composer values
	('M19','Jose Gonzalez');
insert into composer values
	('M20','George Fenton');
insert into composer values
	('M21','Tanishk Bagchi');
insert into composer values
	('M22','Christophe Beck');
insert into composer values
	('M23','Christopher Willis');
insert into composer values
	('M24','Trent Reznor');
insert into composer values
	('M25','Geoff Barrow');
insert into composer values
	('M26','Angelo Badalamenti');
insert into composer values
	('M27','Harry Gregson-Williams');
insert into composer values
	('M28','Justin Hurwitz');
insert into composer values
	('M29','Terence Blanchard');
insert into composer values
	('M30','Ramin Djawadi');
insert into composer values
	('M31','Joe Hisaishi');
insert into composer values
	('M32','Daniel Pemberton');
insert into composer values
	('M33','Danny Elfman');

--- film_awards not updated

insert into film_awards values
	('D02',14,6);
insert into film_awards values
	('D08',4,6);
insert into film_awards values
	('D15',8,9);
insert into film_awards values
	('D17',4,16);
insert into film_awards values
	('D18',13,18);
insert into film_awards values
	('D20',8,19);
insert into film_awards values
	('D34',8,0);
insert into film_awards values
	('D37',17,3);
insert into film_awards values
	('D39',11,0);
insert into film_awards values
	('D43',15,9);


insert into film_awards values
	('S07',17,2);
insert into film_awards values
	('S10',0,4);
insert into film_awards values
	('S12',6,15);
insert into film_awards values
	('S26',3,2);
insert into film_awards values
	('S28',17,2);
insert into film_awards values
	('S29',8,1);
insert into film_awards values
	('S30',4,4);
insert into film_awards values
	('S33',5,3);
insert into film_awards values
	('S37',8,11);
insert into film_awards values
	('S40',16,3);
insert into film_awards values
	('S41',13,6);
insert into film_awards values
	('S42',13,7);


insert into film_awards values
	('M01',18,16);
insert into film_awards values
	('M13',13,14);
insert into film_awards values
	('M20',9,2);
insert into film_awards values
	('M21',12,14);
insert into film_awards values
	('M23',16,15);
insert into film_awards values
	('M26',6,17);
insert into film_awards values
	('M28',4,3);
insert into film_awards values
	('M31',15,16);
insert into film_awards values
	('M36',12,2);

insert into film_awards values
	('F14',13,1);
insert into film_awards values
	('F28',17,2);
insert into film_awards values
	('F27',17,18);
insert into film_awards values
	('F39',12,13);
insert into film_awards values
	('F37',5,2);
insert into film_awards values
	('F22',15,10);
insert into film_awards values
	('F02',1,6);
insert into film_awards values
	('F36',2,5);
insert into film_awards values
	('F30',8,14);
insert into film_awards values
	('F29',5,11);
insert into film_awards values
	('F25',15,15);


--- film_cast entries 

insert into film_cast values
	('C01','Mark Hamill','Carrie Fisher','Harrison Ford',null);
insert into film_cast values
	('C02','Colin Firth','Helena Bonham Carter','Geofferey Rush','Jennifer Ehle');
insert into film_cast values
	('C03','Riz Ahmed',null,'Kayvan Novak',null);
insert into film_cast values
	('C04','Matthew MacFayden','Keira Knightley','Simon Woods','Rosamund Pike');
insert into film_cast values
	('C05','Sir Anthony Hopkins','Jodie Foster','Scott Glenn',null);
insert into film_cast values
	('C06','Al Pacino','Diane Keaton','Marlon Brando','Talia Shire');
insert into film_cast values
	('C07','Keanu Reeves','Carrie-Anne Moss','Laurence Fishburne',null);
insert into film_cast values
	('C08','Al Pacino','Diane Keaton','Fred Kazan','Talia Shire');
insert into film_cast values
	('C09','Henry Golding Jr.','Constance Wu','Chris Pang','Michelle Yeoh');
insert into film_cast values
	('C10','Jay Baruchel','Cate Blanchett','Gerard Butler','America Ferrera');
insert into film_cast values
	('C11','Al Pacino','Diane Keaton','Andy Garcia','Talia Shire');
insert into film_cast values
	('C12','Russel Crowe','Jennifer Connelly','Ed Harris',null);
insert into film_cast values
	('C13','Haley Joel Osment','Toni Collette','Bruce Willis',null);
insert into film_cast values
	('C14','Benedict Cumberbatch','Keira Knightley','Matthew Goode',null);
insert into film_cast values
	('C15','Kevin Spacey',null,'Stephen Baldwin',null);
insert into film_cast values
	('C16','Liam Neeson','Caroline Goodall','Ben Kingsley','Embeth Davidtz');
insert into film_cast values
	('C17','James McAvoy','Anya Taylor-Joy','null','null');
insert into film_cast values
	('C18','Patton Oswalt','Janeane Garofalo','Brad Garrett','null');
insert into film_cast values
	('C19','Hugh Jackman','Dafne Keen','Patrick Stewart','null');
insert into film_cast values
	('C20','Tom Hanks','Emma Thompson','null','null');
insert into film_cast values
	('C21','Christian Bale','Maggie Gyllenhaal','Heath Ledger','null');
insert into film_cast values
	('C22','Ralph Fiennes','Saoirse Ronan','Tony Revolori','null');
insert into film_cast values
	('C23','Guy Pearce','Carrie-Anne Moss','Joe Pantoliano','Jorja Fox');
insert into film_cast values
	('C24','Ayushman Khurrana','Tabu','Zakir Hussain','Radhika Apte');
insert into film_cast values
	('C25','Bruce Willis','null','Samuel L. Jackson','null');
insert into film_cast values
	('C26','Ben Stiller','Kristen Wiig','Sean Penn','Lily Tomlin');
insert into film_cast values
	('C27','Christiam Bale','Scarlett Johannson','Hugh Jackman','Rebecca Hall');
insert into film_cast values
	('C28','Tom Hanks','Meg Ryan','Greg Kinnear','Jean Stapleton');
insert into film_cast values
	('C29','Benedict Cumberbatch','Tild Swinton','Chiwetel Ejiofor','Rachel McAdams');
insert into film_cast values
	('C30','Ayushman Khurrana','Kriti Sanon','Rajkumar Rao','Swati Semwal');
insert into film_cast values
	('C31','Bradley Cooper','null','Zach Galifianakis','null');
insert into film_cast values
	('C32','Steve Buscemi','null','Simon Russell Beale','Olga Kurylenko');
insert into film_cast values
	('C33','null','Sandra Bullock','Trevante Rhodes','Sarah Paulson');
insert into film_cast values
	('C34','Daniel-Day Lewis','Sally Field','David Strathairn','null');
insert into film_cast values
	('C35','null','Natalie Portman','null','Gina Rodriguez');
insert into film_cast values
	('C36','Justin Theroux','Naomi Watts','Rober Forster','Laura Harring');
insert into film_cast values
	('C37','Matt Damon','Jessica Chastain','Chiwetel Ejiofor','Kate Mara');
insert into film_cast values
	('C38','Ryan Gosling','Claire Foy','Jason Clarke','Olivia Hamilton');
insert into film_cast values
	('C39','John Krasinski','Emily Blunt','Noah Jupe','Millicent Simmonds');
insert into film_cast values
	('C40','John David Washington','Laura Harrier','Adam Driver ','null');
insert into film_cast values
	('C41','Charlie Day','Rinko Kikuchi','Idris Elba','null');
insert into film_cast values
	('C42','Christian Bale','Emily Mortimer','Billy Crystal','Jean Simmons');
insert into film_cast values
	('C43','Darren Criss','Chloe Grace Moretz','James Caan','Mary Steenburgen');
insert into film_cast values
	('C44','Thomas Horn','Sandra Bullock','Max von Sydow','Viola Davis');
insert into film_cast values
	('C45','Albert Brooks','Ellen DeGeneres','Alexander Gould','Allison Janney');
insert into film_cast values
	('C46','Shia LaBeouf','Peyton List','Stephen Dillane','null');
insert into film_cast values
	('C47','Shameik Moore','Hailee Steinfeld','Jake Johnson','Lily Tomlin');
insert into film_cast values
	('C48','Bradley Cooper','Jennifer Lawrence','Robert DeNiro','Jacki Weaver');




---film

insert into film values
	('F01','Star Wars: The Empire Strikes Back',1980,'Sci-fi','D01','S01','C01','M01',7.84,63.06,85,57);
insert into film values
	('F02','The King''s Speech',2010,'Drama','D02','S02','C02','M02',8.93,92.01,67,102);
insert into film values
	('F03','Four Lions',2010,'Comedy','D03','S03','C03',null,5.74,99.29,95,152);
insert into film values
	('F04','Pride and Prejudice',2005,'Drama','D04','S04','C04','M03',6.91,39.62,82,431);
insert into film values
	('F05','The Silence of the Lambs',1991,'Thriller','D05','S05','C05','M04',5.99,71.96,84,41);
insert into film values
	('F06','The Godfather',1972,'Drama','D06','S06','C06','M05',7.43,58.16,36,254);
insert into film values
	('F07','The Matrix',1999,'Sci-fi','D07','S07','C07','M06',9.62,53.58,84,100);
insert into film values
	('F08','The Godfather Part II',1974,'Drama','D06','S06','C08','M05',8.22,59.03,40,347);
insert into film values
	('F09','Crazy Rich Asians',2018,'Comedy','D08','S08','C09','M07',7.69,38.21,78,296);
insert into film values
	('F10','How to Train Your Dragon 2',2014,'Comedy','D09','S09','C10','M08',5.75,47.29,37,402);
insert into film values
	('F11','The Godfather Part III',1990,'Drama','D06','S06','C11','M05',4.24,82.62,43,484);
insert into film values
	('F12','A Beautiful Mind',2001,'Biography','D10','S10','C12','M09',9.43,48.22,87,407);
insert into film values
	('F13','The Sixth Sense',1999,'Thriller','D11','S11','C13','M10',5.58,40.07,54,208);
insert into film values
	('F14','The Imitation Game',2014,'Biography','D12','S12','C14','M02',7.5,39.77,36,10);
insert into film values
	('F15','The Usual Suspects',1995,'Thriller','D13','S13','C15','M11',5.27,34.63,95,355);
insert into film values 
	('F16','Schindler''s List',1993,'Drama','D14','S14','C16','M01',7.11,50.82,211,393);
insert into film values 
	('F17','Split',2016,'Thriller','D11','S11','C17','M12',8.70,78.45,190,193);
insert into film values 
	('F18','Ratatouille',2007,'Fantasy','D15','S15','C18','M13',8.53,65.59,104,194);
insert into film values 
	('F19','Logan',2017,'Drama','D16','S16','C19','M14',5.61,70.89,246,508);
insert into film values 
	('F20','Saving Mr. Banks',2013,'Drama','D17','S17','C20','M15',9.02,53.31,111,97);
insert into film values 
	('F21','The Dark Knight',2008,'Thriller','D18','S18','C21','M16',4.50,40.95,145,583);
insert into film values 
	('F22','The Grand Budapest Hotel',2014,'Comedy','D19','S19','C22','M02',4.16,44.71,108,694);
insert into film values 
	('F23','Memento',2000,'Crime','D18','S18','C23','M17',5.76,53.97,191,578);
insert into film values 
	('F24','Andhaadhun',2018,'Crime','D20','S20','C24','M18',7.00,59.49,114,248);
insert into film values 
	('F25','Unbreakable',2000,'Mystery','D11','S11','C25','M10',7.45,95.08,48,167);
insert into film values 
	('F26','The Secret Life of Walter Mitty',2013,'Fantasy','D21','S21','C26','M19',4.39,61.17,227,207);
insert into film values 
	('F27','The Prestige',2006,'Thriller','D18','S18','C27','M16',8.63,56.16,21,522);
insert into film values 
	('F28','You''ve Got Mail',1998,'Romance','D22','S22','C28','M20',7.52,92.12,36,497);
insert into film values 
	('F29','Doctor Strange',2016,'Fantasy','D23','S23','C29','M13',8.49,60.77,106,327);
insert into film values 
	('F30','Bareilly ki Barfi',2017,'Romance','D24','S24','C30','M21',4.94,66.13,55,64);
insert into film values 
	('F31','The Hangover',2009,'Comedy','D25','S25','C31','M22',5.97,43.55,280,166);
insert into film values 
	('F32','The Death of Stalin',2017,'Comedy','D26','S26','C32','M23',7.89,91.24,244,242);
insert into film values 
	('F33','Birdbox',2018,'Thriller','D27','S27','C33','M24',7.93,49.71,208,444);
insert into film values 
	('F34','Lincoln',2012,'Drama','D14','S28','C34','M01',8.81,92.68,270,498);
insert into film values 
	('F35','Annihilation',2018,'Thriller','D27','S29','C35','M25',5.48,74.69,69,220);
insert into film values 
	('F36','Mulolhand Drive',2001,'Mystery','D29','S30','C36','M26',7.99,44.70,121,326);
insert into film values 
	('F37','The Martian',2015,'Drama','D30','S31','C37','M27',6.80,96.47,163,145);
insert into film values 
	('F38','First Man',2018,'Fiction','D31','S32','C38','M28',9.50,81.31,42,512);
insert into film values 
	('F39','A Quiet Place',2018,'Thriller','D32','S33','C39',null,6.52,41.36,126,158);
insert into film values 
	('F40','Blackkklansman',2018,'Crime','D33','S34','C40','M29',7.94,66.19,216,504);
insert into film values 
	('F41','Pacific rim',2013,'Fiction','D34','S35','C41','M30',8.38,43.28,120,418);
insert into film values 
	('F42','Howl''s Moving Castle',2004,'Fantasy','D35','S36','C42','M31',5.03,60.93,118,612);
insert into film values 
	('F43','The Tale of the Princess Kaguya',2013,'Fantasy','D36','S37','C43','M31',7.12,96.07,261,621);
insert into film values 
	('F44','Extremely Loud and Incredibly Close',2011,'Mystery','D37','S38','C44','M02',7.00,68.84,126,551);
insert into film values 
	('F45','Finding Nemo',2003,'Comedy','D38','S15','C45','M15',4.42,54.97,193,66);
insert into film values 
	('F46','The Greatest Game Ever Played',2005,'Drama','D39','S39','C46','M07',6.53,67.74,81,304);
insert into film values 
	('F47','Spider-man Into the Spider-verse',2018,'Fiction','D40','S40','C47','M32',4.01,78.59,62,331);
insert into film values 
	('F48','Silver Lining''s Playbook',2012,'Comedy','D41','S41','C48','M33',7.28,75.63,251,400);
