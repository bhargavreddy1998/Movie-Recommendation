
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
	name varchar2(30) not null
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
	e_year number(4) not null,
	seasons number(4) not null,
	genre varchar2(20) not null,
	cr_id varchar2(3) not null,
	wr_id varchar2(3) not null,
	cas_id varchar2(3) not null,
	net_id varchar2(3),
	imdb float(8),
	rot_tom float(8),
	budget number(10) not null,
	nielsen number(8) not null,
	check (budget>0 and nielsen>0),
	foreign key(cr_id) references creator(cr_id) on delete cascade,
	foreign key(wr_id) references writer(sc_id) on delete cascade,
	foreign key(cas_id) references tcast(cas_id) on delete cascade,
	foreign key(net_id) references network(net_id) on delete cascade
);
--- craetor entries

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

insert into creator values
	('WR01','Jonathan Nolan',125,5.15);
insert into creator values
	('WR02','George R. R. Martin',88,9.28);
insert into creator values
	('WR03','Julian Fellowes',26,5.91);
insert into creator values
	('WR04','Ross Duffer',33,5.10);
insert into creator values
	('WR05','Mark Gatiss',119,8.92);
insert into creator values
	('WR06','Mike Judge',21,6.52);
insert into creator values
	('WR07','Bill Prady',126,6.33);
insert into creator values
	('WR08','Andrew Kreisberg',52,5.31);
insert into creator values
	('WR09','Steven Levitan',110,6.67);
insert into creator values
	('WR10','Marisol Nichols',53,8.06);
insert into creator values
	('WR11','Naoshi Arakawa',72,5.70);
insert into creator values
	('WR12','Tsugumi Ohba',43,6.13);
insert into creator values
	('WR13','Antony Jay',49,9.59);
insert into creator values
	('WR14','Masashi Kishimoto',27,9.87);
insert into creator values
	('WR15','Jane Austen',100,7.53);
insert into creator values
	('WR16','Stan Lee',20,5.17);
insert into creator values
	('WR17','Agatha Christie',119,8.90);
insert into creator values
	('WR18','Jantje Friese',122,8.47);
insert into creator values
	('WR19','Kohei Horikoshi',42,8.35);
insert into creator values
	('WR20','Tina Fey',17,5.67);
insert into creator values
	('WR21','P. G. Wodehouse',124,9.63);
insert into creator values
	('WR22','Andrew Samberg',105,7.22);
insert into creator values
	('WR23','Liz Stanton',86,6.00);
insert into creator values
	('WR24','Matt Sazama',34,5.28);
insert into creator values
	('WR25','Shawn Levy',21,6.80);
insert into creator values
	('WR26','Peter Gould',30,9.55);
insert into creator values
	('WR27','Varun Grover',25,5.56);
insert into creator values
	('WR28','Carl Banks',67,6.31);
insert into creator values
	('WR29','Carlo Bernard',24,6.12);
insert into creator values
	('WR30','J. J. Philbin',97,9.70);
insert into creator values
	('WR31','Mark Frost',88,7.95);
insert into creator values
	('WR32','Jay Katsir',59,6.41);
insert into creator values
	('WR33','Marta Kauffman',30,7.02);
insert into creator values
	('WR34','Seth Meyers',89,8.46);
insert into creator values
	('WR35','Robert Kirk',36,7.33);
insert into creator values
	('WR36','David Zuckerman',14,5.04);
insert into creator values
	('WR37','Patrick Graham',108,7.52);
insert into creator values
	('WR38','Hiroshi Onogi',32,6.91);
insert into creator values
	('WR39','Jeffrey Lieber',32,9.74);
insert into creator values
	('WR40','Rick Remender',79,7.04);
insert into creator values
	('WR41','Justin Rosland',70,6.33);
insert into creator values
	('WR42','Nokaba Suzuki',129,8.09);
insert into creator values
	('WR43','Mark Williams',50,6.71);

--- network entries

insert into creator values
	('NW01','CBS',92);
insert into creator values
	('NW02','HBO',109);
insert into creator values
	('NW03','ITV',98);
insert into creator values
	('NW04','Netflix',28);
insert into creator values
	('NW05','BBC',78);
insert into creator values
	('NW06','CW',84);
insert into creator values
	('NW07','ABC',112);
insert into creator values
	('NW08','A1',66);
insert into creator values
	('NW09','Madhouse',94);
insert into creator values
	('NW10','Shounen',88);
insert into creator values
	('NW11','NBC',64);
insert into creator values
	('NW12','AMC',52);
insert into creator values
	('NW13','Disney',61);
insert into creator values
	('NW14','FX',107);
insert into creator values
	('NW15','Fox',114);
insert into creator values
	('NW16','Funimation',62);
insert into creator values
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

