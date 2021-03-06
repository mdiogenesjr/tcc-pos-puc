FROM node:10.24-alpine as node-tcc
WORKDIR /app
COPY package.json /app
RUN npm install --silent
COPY . .
RUN npm run build

FROM nginx:alpine
VOLUME /var/cache/nginx
COPY --from=node-tcc app/dist/requests-http /usr/share/nginx/html
COPY ./config/nginx.conf /ect/nginx/conf.d/default.conf

