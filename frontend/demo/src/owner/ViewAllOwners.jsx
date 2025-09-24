import React, { useEffect, useState } from "react";

function ViewAllOwners() {
  const [owners, setOwners] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetch("http://localhost:2001/owner/viewall")
      .then((response) => response.json())
      .then((data) => {
        setOwners(data);
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error fetching owners:", error);
        setLoading(false);
      });
  }, []);

  if (loading) {
    return <p>Loading owners...</p>;
  }

  return (
    <div style={{ padding: "20px" }}>
      <h2>All Owners</h2>
      {owners.length === 0 ? (
        <p>No owners found.</p>
      ) : (
        <table border="1" cellPadding="10" cellSpacing="0">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Email</th>
              <th>Gender</th>
              <th>Contact</th>
            </tr>
          </thead>
          <tbody>
            {owners.map((owner) => (
              <tr key={owner.id}>
                <td>{owner.id}</td>
                <td>{owner.name}</td>
                <td>{owner.email}</td>
                <td>{owner.gender}</td>
                <td>{owner.contact}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}

export default ViewAllOwners;
