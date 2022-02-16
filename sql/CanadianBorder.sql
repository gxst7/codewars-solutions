-- 8 kyu On the Canadian Border (SQL for Beginners #2)

SELECT * FROM travelers
WHERE NOT country = 'USA' AND NOT country = 'Canada' AND NOT country = 'Mexico';