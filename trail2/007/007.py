secret_code, meeting_point, time = input().split()
time = int(time)

# Please write your code here.
class Code:
    def __init__(self, code, location, time):
        self.code = code
        self.location = location
        self.time = time

    def to_string(self):
        return f'''
secret code : {self.code}
meeting point : {self.location}
time : {self.time}
        '''.strip()

code = Code(secret_code, meeting_point, time)
print(code.to_string())