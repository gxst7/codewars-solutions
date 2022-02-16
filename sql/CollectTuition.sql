-- 8 kyu Collect Tuition (SQL for Beginners #4)

SELECT name, age, semester, mentor, tuition_received
FROM students
WHERE tuition_received = false;