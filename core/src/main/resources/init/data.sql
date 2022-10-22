INSERT INTO medical_card VALUES (1, 'a', null, '2022-10-20', 'bad');
INSERT INTO medical_card VALUES (2, 'a', null, '2022-10-21', 'bad');
INSERT INTO medical_card VALUES (3, 'a', null, '2022-10-22', 'norm');
INSERT INTO medical_card VALUES (4, 'a', 'i', '2022-10-19', 'bad');
INSERT INTO medical_card VALUES (5, 'p', 'h', '2022-10-18', 'good');
INSERT INTO medical_card VALUES (6, 'a', 'i', '2022-10-17', 'norm');
INSERT INTO medical_card VALUES (7, 'p', 'h', '2022-10-16', 'good');
INSERT INTO medical_card VALUES (8, 'p', 'h', '2022-10-15', 'good');


INSERT INTO contact VALUES (1, '8-960-16-11-123', 'abc@gmail.com', 'smth');
INSERT INTO contact VALUES (2, '8-960-16-11-124', 'def@gmail.com', null);
INSERT INTO contact VALUES (3, '8-960-16-11-125', 'ghi@gmail.com', 'smth');
INSERT INTO contact VALUES (4, '8-960-16-11-126', 'jkl@gmail.com', null);
INSERT INTO contact VALUES (5, '8-960-16-11-127', 'mno@gmail.com', 'smth');
INSERT INTO contact VALUES (6, '8-960-16-11-128', 'pqr@gmail.com', null);
INSERT INTO contact VALUES (7, '8-960-16-11-129', 'stu@gmail.com', 'smth');
INSERT INTO contact VALUES (8, '8-960-16-11-122', 'vwx@gmail.com', null);
INSERT INTO contact VALUES (9, '8-960-16-11-129', 'stu@gmail.com', 'smth');
INSERT INTO contact VALUES (10, '8-960-16-11-122', 'vwx@gmail.com', null);

INSERT INTO illness VALUES (1, 1, 1, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (2, 1, 2, 'B', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (3, 2, 2, 'C', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (4, 2, 1, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (5, 3, 3, 'B', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (6, 4, 1, 'C', CURRENT_TIMESTAMP, CURRENT_DATE);
INSERT INTO illness VALUES (7, 5, 4, 'A', CURRENT_TIMESTAMP, CURRENT_DATE);

INSERT INTO address VALUES (1, 1, 1, 'N.Novgorod', 8003, 'Pushkina', '1', '1');
INSERT INTO address VALUES (2, 2, 1, 'N.Novgorod', 8003, 'Pushkina', '1', '2');
INSERT INTO address VALUES (3, 3, 1, 'N.Novgorod', 8003, 'Pushkina', '1', '3');
INSERT INTO address VALUES (4, 4, 1, 'N.Novgorod', 8003, 'Pushkina', '1', '4');
INSERT INTO address VALUES (5, 5, 1, 'N.Novgorod', 8004, 'Pushkina', '2', '1');
INSERT INTO address VALUES (6, 6, 1, 'N.Novgorod', 8004, 'Pushkina', '2', '1');
INSERT INTO address VALUES (7, 7, 1, 'N.Novgorod', 8004, 'Pushkina', '2', '2');
INSERT INTO address VALUES (8, 8, 1, 'N.Novgorod', 8004, 'Pushkina', '2', '2');

INSERT INTO person_data VALUES (1, 'Kapustin', 'Dmitrii', '1998-06-20', 24, 'm', 1, 1, null);
INSERT INTO person_data VALUES (2, 'Ivanov', 'Ivan', '1998-06-21', 24, 'm', 2, 2, null);
INSERT INTO person_data VALUES (3, 'Ivanova', 'Inna', '2000-10-21', 22, 'f', 3, 3, null);
INSERT INTO person_data VALUES (4, 'Ivanov', 'Oleg', '2021-08-12', 1, 'm', 4, 4, 3);
INSERT INTO person_data VALUES (5, 'Petrova', 'Olga', '1990-09-01', 32, 'f', 5, 5, null);
INSERT INTO person_data VALUES (6, 'Sidorov', 'Kirill', '2001-08-12', 21, 'm', 6, 6, null);
INSERT INTO person_data VALUES (7, 'Shvec', 'Anna', '1950-04-22', 72, 'f', 7, 7, null);
