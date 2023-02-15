FROM alpine
WORKDIR /usr/mydir
COPY . .
CMD ["sleep", "30"]
