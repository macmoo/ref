CREATE FUNCTION get_writer(TEXT) RETURNS refcursor AS '
DECLARE
cur refcursor;
BEGIN
OPEN cur FOR SELECT lastname, firstname FROM writer WHERE lastname = $1;
RETURN cur;
END;
' LANGUAGE plpgsql;