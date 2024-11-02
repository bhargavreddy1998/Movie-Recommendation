
----series

create table creator(
	cr_id varchar2(4) primary key,
	name varchar2(30) not null,
	avg_nielsen float(8) not null,
	avg_imdb float(8) not null
	);
create table writer(
	wr_id varchar2(4) primary key,
	name varchar2(30)not null,
	avg_nielsen float(8)not null,
	avg_imdb float(8) not null
	);
create table network(
	net_id varchar2(4) primary key,
	name varchar2(30) not null,
	budget number(8) not null
);
create table tv_cast(
	cas_id varchar2(4) primary key,
	lead_actor varchar2(30),
	lead_actress varchar2(30),
	supp_actor varchar2(30),
	supp_actress varchar2(30)
);
create table tv_awards(
	id varchar2(4) primary key,
	emmys number(2) not null,
	golden_globes number(2) not null
);
create table series(
	id varchar2(4) primary key,
	title varchar2(40) not null,
	s_year number(4) not null,
	e_year number(4),
	seasons number(4) not null,
	genre varchar2(20) not null,
	cr_id varchar2(4) not null,
	wr_id varchar2(4) not null,
	cas_id varchar2(4) not null,
	net_id varchar2(4),
	imdb float(8),
	rot_tom float(8),
	budget number(10) not null,
	nielsen number(8) not null,
	check (budget>0 and nielsen>0),
	foreign key(cr_id) references creator(cr_id) on delete cascade,
	foreign key(wr_id) references writer(wr_id) on delete cascade,
	foreign key(cas_id) references tv_cast(cas_id) on delete cascade,
	foreign key(net_id) references network(net_id) on delete cascade
);
--- creator entries

insert into creator values
	('CR01','J.J. Abrams',125,8.99);
insert into creator values
	('CR02','D.B. Weiss',60,9.94);
insert into creator values
	('CR03','Julian Fellowes',119,5.52);
insert into creator values
	('CR04','Matt Duffer',120,6.69);
insert into creator values
	('CR05','Steven Moffat',25,8.16);
insert into creator values
	('CR06','Alec Berg',60,5.42);
insert into creator values
	('CR07','Chuck Lorre',28,5.36);
insert into creator values
	('CR08','Greg Berlanti',59,8.54);
insert into creator values
	('CR09','Christopher Lloyd',44,7.76);
insert into creator values
	('CR10','Robert Aguirre-Locasa',27,8.34);
insert into creator values
	('CR11','Kyohei Ishiguro',77,8.49);
insert into creator values
	('CR12','Tetsuro Araki',103,6.64);
insert into creator values
	('CR13','Jonathan Lynn',48,7.05);
insert into creator values
	('CR14','Hayato Date',71,5.57);
insert into creator values
	('CR15','Sue Birtwistle',15,6.97);
insert into creator values
	('CR16','Steve Lightfoot',79,9.91);
insert into creator values
	('CR17','Clive Exton',113,7.09);
insert into creator values
	('CR18','Boran bo Odar',120,7.39);
insert into creator values
	('CR19','Kenji Nagasaki',47,9.59);
insert into creator values
	('CR20','Lorne Michaels',16,5.12);
insert into creator values
	('CR21','Drew Goddard',87,9.16);
insert into creator values
	('CR22','Guy Andrews',76,7.36);
insert into creator values
	('CR23','John Oliver',16,7.50);
insert into creator values
	('CR24','Irwin Allen',126,8.48);
insert into creator values
	('CR25','Jack Burditt',79,5.15);
insert into creator values
	('CR26','Vince Gilligan',110,8.58);
insert into creator values
	('CR27','Anurag Kashyap',46,9.04);
insert into creator values
	('CR28','Matt Youngberg',73,9.13);
insert into creator values
	('CR29','Chris Brancato',121,8.56);
insert into creator values
	('CR30','Elizabeth Meriwether',51,6.52);
insert into creator values
	('CR31','David Lynch',20,5.64);
insert into creator values
	('CR32','Stephen Colbert',52,7.78);
insert into creator values
	('CR33','David Crane',48,5.90);
insert into creator values
	('CR34','Frank Darabont',81,9.61);
insert into creator values
	('CR35','Seth MacFarlane',96,6.44);
insert into creator values
	('CR36','Patrick Graham',76,5.03);
insert into creator values
	('CR37','Yasuhiro Irie',60,9.47);
insert into creator values
	('CR38','Melissa Rosenberg',67,5.40);
insert into creator values
	('CR39','Rick Remender',36,6.04);
insert into creator values
	('CR40','Dan Harmon',44,5.02);
insert into creator values
	('CR41','Tensai Okamura',72,8.86);
insert into creator values
	('CR42','Bill Dubuque',53,5.95);
insert into creator values
	('CR43','Robin Green',91,5.62);

--- writer entries

insert into writer values
	('WR01','Jonathan Nolan',125,5.15);
insert into writer values
	('WR02','George R. R. Martin',88,9.28);
insert into writer values
	('WR03','Julian Fellowes',26,5.91);
insert into writer values
	('WR04','Ross Duffer',33,5.10);
insert into writer values
	('WR05','Mark Gatiss',119,8.92);
insert into writer values
	('WR06','Mike Judge',21,6.52);
insert into writer values
	('WR07','Bill Prady',126,6.33);
insert into writer values
	('WR08','Andrew Kreisberg',52,5.31);
insert into writer values
	('WR09','Steven Levitan',110,6.67);
insert into writer values
	('WR10','Marisol Nichols',53,8.06);
insert into writer values
	('WR11','Naoshi Arakawa',72,5.70);
insert into writer values
	('WR12','Tsugumi Ohba',43,6.13);
insert into writer values
	('WR13','Antony Jay',49,9.59);
insert into writer values
	('WR14','Masashi Kishimoto',27,9.87);
insert into writer values
	('WR15','Jane Austen',100,7.53);
insert into writer values
	('WR16','Stan Lee',20,5.17);
insert into writer values
	('WR17','Agatha Christie',119,8.90);
insert into writer values
	('WR18','Jantje Friese',122,8.47);
insert into writer values
	('WR19','Kohei Horikoshi',42,8.35);
insert into writer values
	('WR20','Tina Fey',17,5.67);
insert into writer values
	('WR21','P. G. Wodehouse',124,9.63);
insert into writer values
	('WR22','Andrew Samberg',105,7.22);
insert into writer values
	('WR23','Liz Stanton',86,6.00);
insert into writer values
	('WR24','Matt Sazama',34,5.28);
insert into writer values
	('WR25','Shawn Levy',21,6.80);
insert into writer values
	('WR26','Peter Gould',30,9.55);
insert into writer values
	('WR27','Varun Grover',25,5.56);
insert into writer values
	('WR28','Carl Banks',67,6.31);
insert into writer values
	('WR29','Carlo Bernard',24,6.12);
insert into writer values
	('WR30','J. J. Philbin',97,9.70);
insert into writer values
	('WR31','Mark Frost',88,7.95);
insert into writer values
	('WR32','Jay Katsir',59,6.41);
insert into writer values
	('WR33','Marta Kauffman',30,7.02);
insert into writer values
	('WR34','Seth Meyers',89,8.46);
insert into writer values
	('WR35','Robert Kirk',36,7.33);
insert into writer values
	('WR36','David Zuckerman',14,5.04);
insert into writer values
	('WR37','Patrick Graham',108,7.52);
insert into writer values
	('WR38','Hiroshi Onogi',32,6.91);
insert into writer values
	('WR39','Jeffrey Lieber',32,9.74);
insert into writer values
	('WR40','Rick Remender',79,7.04);
insert into writer values
	('WR41','Justin Rosland',70,6.33);
insert into writer values
	('WR42','Nokaba Suzuki',129,8.09);
insert into writer values
	('WR43','Mark Williams',50,6.71);

--- network entries

insert into network values
	('NW01','CBS',92);
insert into network values
	('NW02','HBO',109);
insert into network values
	('NW03','ITV',98);
insert into network values
	('NW04','Netflix',28);
insert into network values
	('NW05','BBC',78);
insert into network values
	('NW06','CW',84);
insert into network values
	('NW07','ABC',112);
insert into network values
	('NW08','A1',66);
insert into network values
	('NW09','Madhouse',94);
insert into network values
	('NW10','Shounen',88);
insert into network values
	('NW11','NBC',64);
insert into network values
	('NW12','AMC',52);
insert into network values
	('NW13','Disney',61);
insert into network values
	('NW14','FX',107);
insert into network values
	('NW15','Fox',114);
insert into network values
	('NW16','Funimation',62);
insert into network values
	('NW17','SyFy',16);

---tv cast entries
insert into tv_cast values
	('CT01','Michael Emerson','Amy Acker','Jim Caviezel','Sarah Shahi');
insert into tv_cast values
	('CT02','Peter Dinklage','Emilia Clarke','Kit Harrington','Lena Headey');
insert into tv_cast values
	('CT03','Hugh Bonneville','Michelle Dockery','Jim Carter','Phyllis Logan');
insert into tv_cast values
	('CT04','David Harbour','Winona Ryder','Finn Wolfhard','Millie Bobby Brown');
insert into tv_cast values
	('CT05','Peter Capaldi','Jenna Coleman','Matt Smith','Karen Gillan');
insert into tv_cast values
	('CT06','Benedict Cumberbatch','Lara Pulver','Martin Freeman','Amanda Abbington');
insert into tv_cast values
	('CT07','Thomas Middleditch','Amanda Crew','Zach Woods','null');
insert into tv_cast values
	('CT08','Johnny Galecki','Kaley Cuoco','Jim Parsons','Mayim Bialik');
insert into tv_cast values
	('CT09','Sir Anthony Hopkins','Rachel Evan Wood','Jeffrey Wright','Thandie Newton');
insert into tv_cast values
	('CT10','Stephen Amell','Katie Cassidy Rodgers','Colin Donnell','null');
insert into tv_cast values
	('CT11','Ed O''Neill','Sofia Vergara','Ty Burrell','Julie Bowen');
insert into tv_cast values
	('CT12','K. J. Apa','Lili Reinhart','Cole Sprouse','Camila Mendes');
insert into tv_cast values
	('CT13','Natsuki Hanae','Risa Taneda','Ryota Osaka','Ayane Sakura');
insert into tv_cast values
	('CT14','Mamoru Miyano','Aya Hitano','Kappei Yamaguchi','null');
insert into tv_cast values
	('CT15','Paul Eddington','null','Nigel Hawthorne','null');
insert into tv_cast values
	('CT16','Junko Takeuchi','Masako Katsuki','Kazuhiko Inouoe','Chie Nakamura');
insert into tv_cast values
	('CT17','Colin Firth','Jennifer Ehle','Crispin Bonham-Carter','Susannah Harker');
insert into tv_cast values
	('CT18','Jon Bernthal','Amber Rose Revah','Ben Barnes','null');
insert into tv_cast values
	('CT19','David Suchet','null','Hugh Fraser','null');
insert into tv_cast values
	('CT20','Oliver Masucci','Karoline Eichhorn','null','null');
insert into tv_cast values
	('CT21','Daiki Yamashita','Ayane Sakura','Kenta Miyake','null');
insert into tv_cast values
	('CT22','Grant Gustin','Candice Patton','null','null');
insert into tv_cast values
	('CT23','Alec Baldwin','Tina Fey','Tracy Morgan','Jane Krakowski');
insert into tv_cast values
	('CT24','Charlie Cox','Deborah Ann Woll','Elden Henson','null');
insert into tv_cast values
	('CT25','Timothy Spall','Jennifer Saunders','Tim Vine','null');
insert into tv_cast values
	('CT26','Andy Samberg','Melissa Fumero','Andre Braugher','Stephanie Beatriz');
insert into tv_cast values
	('CT27','John Oliver','null','null','null');
insert into tv_cast values
	('CT28','Toby Stephens','Molly Parker','Maxwell Jenkins','null');
insert into tv_cast values
	('CT29','Tim Allen','Nancy Travers','Hector Elizondo','Kaitlyn Dever');
insert into tv_cast values
	('CT30','Bryan Cranston','Anna Gunn','Aaron Paul','null');
insert into tv_cast values
	('CT31','Nawazuddin Siddiqui','null','Saif Ali Khan','null');
insert into tv_cast values
	('CT32','David Tennant','Kate Micucci','Danny Pudi','Toks Olagundoye');
insert into tv_cast values
	('CT33','Pedro Pascal','Paulina Gaitan','Wagner Moura','null');
insert into tv_cast values
	('CT34','Taran Killam','Leighton Meester','Jake Choi','Kimrie Lewis');
insert into tv_cast values
	('CT35','Kyle MacLachlan','Madchen Amick','Michael Ontkean','Lara Flynn Boyle');
insert into tv_cast values
	('CT36','Stephen Colbert','null','null','null');
insert into tv_cast values
	('CT37','Matthew Perry','Courtney Cox','David Schwimmer','Jennifer Aniston');
insert into tv_cast values
	('CT38','Seth Meyers','Aidy Bryant','Bill Hader ','Kate McKinnon');
insert into tv_cast values
	('CT39','Andrew Lincoln','Lauren Cohan','Norman Reedus','Melissa McBride');
insert into tv_cast values
	('CT40','Seth MacFarlane','Alex Borstein','Seth Green','Mila Kunis');
insert into tv_cast values
	('CT41','Manav Kaul','Radhika Apte','null','null');
insert into tv_cast values
	('CT42','Romi Pak','Shinchiro Miki','Rie Kugimiya','Megumi Takamoto');
insert into tv_cast values
	('CT43','null','Krysten Ritter','Eka Darville','Carrie-Ann Moss');
insert into tv_cast values
	('CT44','Josh Holloway','Evangeline Lilly','Michael Emerson','Yunjin Kim');
insert into tv_cast values
	('CT45','Brandon Routh','Caity Lotz','Dominic Purcell','null');
insert into tv_cast values
	('CT46','Benjamin Wadsworth','Lana Condor','Benedict Wong','Maria Gabriela de Faria');
insert into tv_cast values
	('CT47','Justin Roiland','Spencer Grammer','Chris Parnell','null');
insert into tv_cast values
	('CT48','Yuki Kaji','Sora Amamiya','Tatsuhisa Suzuki','Aoi Yuki');
insert into tv_cast values
	('CT49','Jason Bateman','Laura Linney','null','null');
insert into tv_cast values
	('CT50','Tom Selleck','Bridget Moynahan','Donnie Wahlberg','null');

---TV Awards

insert into tv_awards values
	('CR02',14,6);
insert into tv_awards values
	('CR08',4,6);
insert into tv_awards values
	('CR15',8,9);
insert into tv_awards values
	('CR17',4,16);
insert into tv_awards values
	('CR18',13,18);
insert into tv_awards values
	('CR20',8,19);
insert into tv_awards values
	('CR34',8,0);
insert into tv_awards values
	('CR37',17,3);
insert into tv_awards values
	('CR39',11,0);
insert into tv_awards values
	('CR43',15,9);


insert into tv_awards values
	('WR07',17,2);
insert into tv_awards values
	('WR10',0,4);
insert into tv_awards values
	('WR12',6,15);
insert into tv_awards values
	('WR26',3,2);
insert into tv_awards values
	('WR28',17,2);
insert into tv_awards values
	('WR29',8,1);
insert into tv_awards values
	('WR30',4,4);
insert into tv_awards values
	('WR33',5,3);
insert into tv_awards values
	('WR37',8,11);
insert into tv_awards values
	('WR40',16,3);
insert into tv_awards values
	('WR41',13,6);
insert into tv_awards values
	('WR42',13,7);


insert into tv_awards values
	('NW01',18,16);
insert into tv_awards values
	('NW13',13,14);
insert into tv_awards values
	('NW05',9,2);
insert into tv_awards values
	('NW08',12,14);
insert into tv_awards values
	('NW17',16,15);
insert into tv_awards values
	('NW02',6,17);
insert into tv_awards values
	('NW04',4,3);
insert into tv_awards values
	('NW06',15,16);
insert into tv_awards values
	('NW12',12,2);

insert into tv_awards values
	('SR14',13,1);
insert into tv_awards values
	('SR28',17,2);
insert into tv_awards values
	('SR27',17,18);
insert into tv_awards values
	('SR39',12,13);
insert into tv_awards values
	('SR37',5,2);
insert into tv_awards values
	('SR22',15,10);
insert into tv_awards values
	('SR02',1,6);
insert into tv_awards values
	('SR36',2,5);
insert into tv_awards values
	('SR30',8,14);
insert into tv_awards values
	('SR29',5,11);
insert into tv_awards values
	('SR25',15,15);

--- series

insert into series values 
('SR01','Person of Interest',2011,2016,5,'Drama','CR01','WR01','CT01','NW01',7.27,90.15,64,83);
insert into series values 
('SR02','Game of Thrones',2011,2019,8,'Drama','CR02','WR02','CT02','NW02',8.63,58.71,53,84);
insert into series values 
('SR03','Downton Abbey',2010,2015,6,'Drama','CR03','WR03','CT03','NW03',6.00,30.22,77,152);
insert into series values 
('SR04','Stranger Things',2016,null,2,'Fiction','CR04','WR04','CT04','NW04',4.84,50.93,72,70);
insert into series values 
('SR05','Doctor Who',2005,null,11,'Fiction','CR05','WR05','CT05','NW05',8.74,86.07,124,42);
insert into series values 
('SR06','Sherlock',2010,2017,4,'Crime','CR05','WR05','CT06','NW05',7.26,57.41,87,111);
insert into series values 
('SR07','Silicon Valley',2014,2018,5,'Comedy','CR06','WR06','CT07','NW02',6.67,64.20,122,108);
insert into series values 
('SR08','Westworld',2016,null,2,'Fiction','CR01','WR01','CT08','NW02',5.30,43.38,31,75);
insert into series values 
('SR09','The Big Bang Theory',2007,2019,12,'Comedy','CR07','WR07','CT09','NW01',6.88,50.07,96,126);
insert into series values 
('SR10','Arrow',2012,null,7,'Fiction','CR08','WR08','CT10','NW06',4.71,59.07,128,120);
insert into series values 
('SR11','Modern Family',2009,null,10,'Comedy','CR09','WR09','CT11','NW07',4.86,39.41,115,151);
insert into series values 
('SR12','Riverdale',2017,null,3,'Drama','CR10','WR10','CT12','NW06',6.10,58.81,93,126);
insert into series values 
('SR13','Your Lie in April',2014,2015,1,'Romance','CR11','WR11','CT13','NW08',8.74,69.79,73,93);
insert into series values 
('SR14','Death Note',2006,2007,1,'Mystery','CR12','WR12','CT14','NW09',9.68,32.75,81,74);
insert into series values 
('SR15','Yes, Minister',1980,1982,3,'Comedy','CR13','WR13','CT15','NW05',7.13,65.86,146,136);
insert into series values 
('SR16','Naruto Shippuden',2007,2017,21,'Fiction','CR14','WR14','CT16','NW10',5.76,96.13,76,150);
insert into series values 
('SR17','Pride and Prejudice',1995,1995,1,'Drama','CR15','WR15','CT17','NW05',5.18,73.60,111,147);
insert into series values 
('SR18','Punisher',2017,null,2,'Crime','CR16','WR16','CT18','NW04',4.01,52.26,92,51);
insert into series values 
('SR19','Poirot',1989,2013,13,'Thriller','CR17','WR17','CT19','NW03',6.72,48.46,110,114);
insert into series values 
('SR20','My Hero Academia',2016,null,3,'Fiction','CR18','WR18','CT20','NW10',8.57,75.27,61,157);
insert into series values 
('SR21','Dark',2017,null,1,'Thriller','CR19','WR19','CT21','NW04',5.21,60.38,39,80);
insert into series values 
('SR22','The Flash',2014,null,5,'Fiction','CR08','WR08','CT22','NW06',4.46,47.66,43,131);
insert into series values 
('SR23','30 Rock',2006,2013,7,'Comedy','CR20','WR20','CT23','NW11',7.72,47.07,117,67);
insert into series values 
('SR24','Daredevil',2015,2018,3,'Fiction','CR21','WR16','CT24','NW04',9.58,72.83,90,109);
insert into series values 
('SR25','Blandings',2013,2014,2,'Comedy','CR22','WR21','CT25','NW05',8.88,95.37,45,156);
insert into series values 
('SR26','Brooklyn Nine-Nine',2013,null,6,'Comedy','CR20','WR22','CT26','NW11',9.55,92.82,116,137);
insert into series values 
('SR27','Last Week Tonight',2014,null,6,'Comedy','CR23','WR23','CT27','NW02',9.93,43.45,71,81);
insert into series values 
('SR28','Lost in Space',2018,null,1,'Fiction','CR24','WR24','CT28','NW04',8.57,86.63,50,138);
insert into series values 
('SR29','Last Man Standing',2011,null,7,'Comedy','CR25','WR25','CT29','NW07',8.93,35.75,139,119);
insert into series values 
('SR30','Breaking Bad',2008,2013,5,'Thriller','CR26','WR26','CT30','NW12',9.34,53.17,99,142);
insert into series values 
('SR31','Sacred Games',2018,null,1,'Mystery','CR27','WR27','CT31','NW04',4.41,80.56,114,95);
insert into series values 
('SR32','Duck Tales',2017,null,2,'Fiction','CR28','WR28','CT32','NW13',7.55,31.32,88,151);
insert into series values 
('SR33','Narcos',2015,2017,3,'Crime','CR29','WR29','CT33','NW04',7.17,80.52,49,136);
insert into series values 
('SR34','Single Parents',2018,null,1,'Comedy','CR30','WR30','CT34','NW07',7.82,33.15,123,74);
insert into series values 
('SR35','Twin Peaks',1990,1991,2,'Mystery','CR31','WR31','CT35','NW01',4.77,80.11,49,66);
insert into series values 
('SR36','The Late Show',2016,null,4,'Comedy','CR32','WR32','CT36','NW01',5.59,91.58,45,53);
insert into series values 
('SR37','Friends',1994,2004,10,'Comedy','CR33','WR33','CT37','NW11',9.71,97.81,79,122);
insert into series values 
('SR38','Saturday Night Live',1975,null,44,'Comedy','CR34','WR38','CT38','NW11',7.50,61.27,88,61);
insert into series values 
('SR39','The Walking Dead',2010,null,9,'Horror','CR34','WR35','CT39','NW14',7.97,88.70,148,126);
insert into series values 
('SR40','Family Guy',1999,null,17,'Comedy','CR35','WR36','CT40','NW15',6.86,93.36,79,45);
insert into series values 
('SR41','Ghoul',2018,2018,1,'Horror','CR36','WR37','CT41','NW04',8.04,30.64,44,67);
insert into series values 
('SR42','Full Metal Alchemist: Brotherhood',2009,2010,1,'Fiction','CR37','WR38','CT42','NW16',7.74,53.49,79,156);
insert into series values 
('SR43','Jessica Jones',2015,2019,2,'Thriller','CR38','WR16','CT43','NW04',9.27,64.63,77,40);
insert into series values 
('SR44','Legends of Tomorrow',2016,null,2,'Drama','CR08','WR08','CT44','NW06',9.24,45.80,65,59);
insert into series values 
('SR45','Lost ',2004,2010,6,'Mystery','CR01','WR39','CT45','NW07',6.80,86.20,125,71);
insert into series values 
('SR46','Deadly Class',2019,null,1,'Thriller','CR39','WR40','CT46','NW17',8.75,53.33,60,80);
insert into series values 
('SR47','Rick and Morty',2013,null,3,'Comedy','CR40','WR41','CT47','NW02',7.79,55.38,33,75);
insert into series values 
('SR48','Seven Deadly Sins',2014,null,2,'Comedy','CR41','WR42','CT48','NW10',9.29,79.08,122,81);
insert into series values 
('SR49','Ozark',2017,null,2,'Thriller','CR42','WR43','CT49','NW04',7.22,42.83,139,80);
insert into series values 
('SR50','Blue Bloods',2010,null,9,'Crime','CR43','WR43','CT50','NW01',7.36,72.88,45,156);