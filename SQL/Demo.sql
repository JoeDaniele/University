-- SELECT 'Hello', 'World';    2 DASHES IS A COMMENT -- = //
-- SELECT 'Hello' as FirstWord, 'World' as SecondWord;
USE contacts; -- using contacts data set, all code pulls from contacts
 
SELECT DISTINCT p.person_first_name, p.person_last_name as FirstName
FROM person p;
