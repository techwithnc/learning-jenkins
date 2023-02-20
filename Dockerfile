FROM alpine
WORKDIR /usr/mydir
COPY file.txt .
CMD ["sleep", "30"]
