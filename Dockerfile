FROM ubuntu:latest
LABEL authors="PauloElzeman"

ENTRYPOINT ["top", "-b"]