-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition
-- ORDER BY column_name(s);
-- 
SELECT count(*) AS CNT
FROM (SELECT RESPONDENTS_ID, count(*)
FROM statistics
GROUP BY RESPONDENTS_ID) AS T_STATIC
;