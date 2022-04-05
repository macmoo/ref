CREATE OR REPLACE PROCEDURE get_writer(input_lastname IN VARCHAR2, cur OUT SYS_RE
FCURSOR)
AS
BEGIN
OPEN cur FOR SELECT lastname, firstname FROM writer WHERE lastname = input_last
Name;
END get_writer;
/