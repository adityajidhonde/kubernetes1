const express = require('express');
const app = express();
const port = 3000;

app.get('/api/status', (req, res) => {
  res.json({
    service: 'Node.js Frontend API',
    status: 'Healthy',
    timestamp: new Date().toISOString()
  });
});

app.listen(port, () => {
  console.log(`Node app listening at http://localhost:${port}`);
});