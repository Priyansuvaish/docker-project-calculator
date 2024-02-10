FROM python:3.10-slim
COPY HelloWorld.py /app/HelloWorld.py
RUN pip install --no-cache-dir -r requirements.txt

# Run hello.py when the container launches
CMD ["python", "HelloWorld.py"]
