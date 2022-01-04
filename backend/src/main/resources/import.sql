-- Trainer
Insert into trainer(dob, firstname, lastname)
values ('01-01-1980', 'Trainer', 'Nachname');
Insert into trainer(dob, firstname, lastname)
values ('01-01-1980', 'Trainer', 'Cooler Nachname');
Insert into trainer(dob, firstname, lastname)
values ('01-01-1980', 'Trainer', 'Nicht cooler Nachname');


-- Squads
Insert into squad(ageforsquad, name, trainer_id)
values (2006, 'A-Kader', 1);
Insert into squad(ageforsquad, name, trainer_id)
values (2008, 'B-Kader', 2);
Insert into squad(ageforsquad, name, trainer_id)
values (2010, 'C-Kader', 3);


--for trainer_squad
Insert into trainer_squad(squads_id, trainer_id)
values (1, 1);
Insert into trainer_squad(squads_id, trainer_id)
values (2, 2);
Insert into trainer_squad(squads_id, trainer_id)
values (3, 3);

--for swimmer
Insert into swimmer(attendanceinhours, beststroke, dob, firstname, kilometerswam, lastname, squad_id)
values (0, 'Kraul', '05-08-2004', 'Oliver', 0, 'Sugic', 1);
Insert into swimmer(attendanceinhours, beststroke, dob, firstname, kilometerswam, lastname, squad_id)
values (0, 'Kraul', '05-08-2004', 'Keine', 0, 'Ahunug', 1);
Insert into swimmer(attendanceinhours, beststroke, dob, firstname, kilometerswam, lastname, squad_id)
values (0, 'Kraul', '05-08-2004', 'test', 0, 'test', 1);





