CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        SELECT salary
        FROM (
            SELECT salary,
                   DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
            FROM (
                SELECT DISTINCT salary
                FROM Employee
            ) AS d
        ) AS t
        WHERE rnk = N
  );
END