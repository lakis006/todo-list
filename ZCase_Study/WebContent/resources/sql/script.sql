insert into todolist (user_id) values (1);

insert into users (email, password, name ) values ("test@aol.com", "12345", "testuser1");

insert into todotask (tname, tdesc, donedate, isComplete, listId ) values ("grocery list", "eat food, get drinks, and be happy", 12/01/2012, false, 2);

UPDATE todotask SET username = "testuser1" WHERE id = 2;