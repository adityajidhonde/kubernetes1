# 1. Start with a lightweight base image (Alpine Linux is standard in DevOps to keep image sizes small)
FROM node:18-alpine

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy only package.json first to leverage Docker cache
COPY package*.json ./

# 4. Install dependencies
RUN npm install

# 5. Copy the rest of the application code
COPY . .

# 6. Document that this container uses port 3000
EXPOSE 3000

# 7. Define the command to run the app when the container starts
CMD ["npm", "start"]