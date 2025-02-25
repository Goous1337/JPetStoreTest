# Используем легковесный образ Python
FROM python:3.9-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем зависимости Python
COPY requirements.txt .

# Устанавливаем зависимости
RUN pip install --no-cache-dir -r requirements.txt

# Копируем весь проект (включая app.py)
COPY . .

# Запускаем приложение
CMD ["python", "app.py"]
