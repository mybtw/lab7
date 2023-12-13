FROM ruby:2.7

WORKDIR /usr/src/app

COPY . .

CMD ["ruby", "main.rb"]