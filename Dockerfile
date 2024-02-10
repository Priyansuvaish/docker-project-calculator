FROM ubuntu:latest
COPY HelloWorld.py /app/HelloWorld.py
RUN pip install python

# Run hello.py when the container launches
CMD ["python", "HelloWorld.py"]
