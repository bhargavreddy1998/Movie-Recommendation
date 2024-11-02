select f.id,title,year,genre,
    d.name director,s.name screenwriter,
    a.lead_actor,a.lead_actress,a.supp_actor,
    a.supp_actress,c.name composer,
    imdb,rot_tom,
    budget,box_office,
    oscars,golden_globes
    from film f left join film_awards w on f.id=w.id,director d,screenwriter s,film_cast a,composer c 
    where 
    f.dir_id=d.dir_id and
    f.sc_id=s.sc_id and
    f.cas_id=a.cas_id and
    f.comp_id=c.comp_id and
    f.id='F02';

    select f.id,title,s_year,e_year,genre, d.name director,s.name screenwriter, a.lead_actor,a.lead_actress,a.supp_actor, a.supp_actress,c.name composer, imdb,rot_tom, f.budget,nielsen, emmys,golden_globes from series f left join tv_awards w on f.id=w.id,creator d,writer s,tv_cast a,network c where f.cr_id=d.cr_id and f.wr_id=s.wr_id and f.cas_id=a.cas_id and f.net_id=c.net_id and f.id='SR02';
    